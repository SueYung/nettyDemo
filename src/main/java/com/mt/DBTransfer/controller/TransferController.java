package com.mt.DBTransfer.controller;

import com.mt.DBTransfer.annotation.ParseAnnotation;
import com.mt.DBTransfer.domain.DBTransEntity;
import com.mt.DBTransfer.domain.DbEntityList;
import com.mt.DBTransfer.entityConverter.ScaleConverter;
import com.mt.DBTransfer.fromentity.ET;
import com.mt.DBTransfer.fromentity.Plu;
import com.mt.DBTransfer.fromentity.Scale;
import com.mt.DBTransfer.fromentity.Store;
import com.mt.DBTransfer.toentity.Tscale;
import com.mt.DBTransfer.utils.DbExecutor;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class TransferController {
       
    @Resource 
    private ParseAnnotation parseAnnotation;
    
    @Resource
    private ScaleConverter scaleConverter;

    @RequestMapping("dataTransfer")
    @ResponseBody
    public void dataTransfer(@Valid DbEntityList entities,BindingResult result) {
        try {
            DBTransEntity from = entities.getEntities().get(0);
            DBTransEntity to = entities.getEntities().get(1);
            String querySql = "select * from ";
            DbExecutor fromExecutor = new DbExecutor(from);
            DbExecutor toExecutor = new DbExecutor(to);
            if ("STORE".equals(from.getTable())) {
                List<Store> originalData = fromExecutor.query(querySql + from.getTable(),Store.class);
                for(Store store : originalData){
                    String insertSql = "insert into "+to.getTable()+" (id,store_no,folder_no,store_name,is_enabled,store_ip,store_port,is_auto_upgrade,is_readonly,creator,c_datetime,c_location,phone,address,remark,m_datetime) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    Object[] params = new Object[]{store.getSTORE_NO(),store.getSTORE_NO(),0,store.getSTORE_NAME(),1,store.getSTORE_IP(),8700,1,0,store.getSTORE_CONNECTER(),new Timestamp(System.currentTimeMillis()),0,store.getSTORE_PHONE(),store.getSTORE_ADDRESS(),store.getSTORE_MEMO(),new Timestamp(System.currentTimeMillis())};
                    toExecutor.execute(insertSql,params);
                }
            }else if("EXTRA_TEXT".equals(from.getTable())){
                String etSql = "select * from EXTRA_CONTENT a ,EXTRA_TEXT b   where a.EX_NO = b.EX_NO";
                List<ET> originalET = fromExecutor.query(etSql,ET.class);
                for(ET et : originalET){
                    String insertSql = "insert into "+to.getTable()+" (id,zone_id,store_no,dept_no,folder_no,et_no,text_a,font_size_a,is_readonly,creator,c_datetime,c_location,modifier,m_datetime) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    Object[] params = new Object[]{et.getID(),"NA",0,et.getDEPARTMENT_NO(),0,et.getID(),et.getEX_TEXT(),et.getEX_FONT(),0,et.getC_USEROID(),et.getC_DATETIME(),0,et.getM_USEROID(),et.getM_DATETIME()};
                    toExecutor.execute(insertSql,params);//et_No唯一键约不成立
                }
            }else if("ARTICLE".equals(from.getTable())){
                String pluSql = "select *,(select dept.DEPARTMENT_NO from ARTICLE_DEPARTMENT dept where dept.PLU_NO = plu.PLU_NO) as deptNo,"+
                  "(select lable.ID from ARTICLE_LABLE lable where lable.PLU_NO = plu.PLU_NO) as lableNo from ARTICLE plu";//lable
                List<Plu> originalPlu = fromExecutor.query(pluSql ,Plu.class);
                for(Plu plu : originalPlu){
                    String insertSql = "insert into "+to.getTable()+" (id,zone_id,store_no,dept_no,folder_no,et_no,text_a,font_size_a,is_readonly,creator,c_datetime,modifier,m_datetime) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    Object[] params = new Object[]{};
                    toExecutor.execute(insertSql,params);
            }
            }else if ("SCALE".equals(from.getTable())) {
                String scaleSql = "select * from SCALE";
                Tscale tscale = new Tscale();
                List<Scale> originalScale = fromExecutor.query(scaleSql ,Scale.class);
                for(Scale scale : originalScale){
                    Tscale sTscale = scaleConverter.convert(scale, tscale);
                    String insertSql = parseAnnotation.parseColumn(tscale);
                    toExecutor.execute(insertSql,parseAnnotation.getObjValue(sTscale));
            }
        }
        }
      catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @RequestMapping("/index")
    public String index(){
        return "index/datatrans";
    }
}
