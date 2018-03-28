package com.mt.DBTransfer.annotation;

import com.mt.DBTransfer.toentity.Table;

import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;

@Component
public class ParseAnnotation {
    
    public <T extends Table> String parseColumn(T t){
        @SuppressWarnings("rawtypes")
        Class clz = t.getClass();
        Field[] fields = clz.getDeclaredFields();
        String insertTables ="";
        String placeHolder = "";
        for(Field f : fields){
            String annotation = f.getAnnotation(Column.class).value();
            String fieldName = f.getName();
            insertTables = insertTables + annotation + ",";
            placeHolder = placeHolder + "?" + ",";
            System.out.println(annotation + "->" +fieldName);
        }
        
        String subTables = insertTables.substring(0, insertTables.length() - 1);
        String subholder = placeHolder.substring(0, placeHolder.length() -1);
        return  "insert into "+this.parseTable(t)+"("+subTables+") values ("+subholder+")";
    }
    
    public <T> Object[] getObjValue(T t) throws IllegalArgumentException, IllegalAccessException{
        Class clz = t.getClass();
        Field[] fields = clz.getDeclaredFields();
        ArrayList list = new ArrayList<>();
        for(Field field : fields){
            field.setAccessible(true);
            if(field != null){
                list.add(field.get(t));
            }
        }
        return  list.toArray();
    }
    
    public String parseTable(Table table) {//面向接口编程
        return  table.getTable();
    }
}
