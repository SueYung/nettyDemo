package com.mt.DBTransfer.toentity;

import com.mt.DBTransfer.annotation.Column;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.ArrayList;

@Component
public class Tscale implements Table{
    
    @Column(value = "id")
    private String id;
    
    @Column(value = "store_no")
    private int store_no;
    
    @Column(value = "folder_no")
    private int folder_no;
    
    @Column(value = "scale_no")
    private int scale_no;
    
    @Column(value = "is_name_sync")
    private int is_name_sync;
    
    @Column(value = "scale_ip")
    private String scale_ip;
    
    @Column(value = "scale_port")
    private int scale_port;
    
    @Column(value = "is_no_last_ip")
    private int is_no_last_ip;
    
    @Column(value = "scale_type")
    private String scale_type;
    
    @Column(value = "sub_type")
    private String sub_type;
    
    @Column(value = "conn_type")
    private String conn_type;

    @Column(value = "is_transmit")
    private int is_transmit;
    
    @Column(value = "is_enabled")
    private int is_enabled;
    
    @Column(value = "is_locked")
    private int is_locked;
    
    @Column(value = "delete_flag")
    private int delete_flag;
    
    @Column(value = "ticket_no")
    private int ticket_no;
    
    @Column(value = "is_monitored")
    private int is_monitored;
    
    @Column(value = "monitor_flag")
    private int monitor_flag;
    
    @Column(value = "is_readonly")
    private int is_readonly;
    
    @Column(value = "creator")
    private int creator;
    
    @Column(value = "c_datetime")
    private Timestamp c_datetime;
    
    @Column(value = "c_location")
    private int c_location;
    
    @Column(value = "m_datetime")
    private Timestamp m_datetime;
    
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getStore_no() {
        return this.store_no;
    }
    public void setStore_no(int store_no) {
        this.store_no = store_no;
    }
    public int getFolder_no() {
        return this.folder_no;
    }
    public void setFolder_no(int folder_no) {
        this.folder_no = folder_no;
    }
    public int getScale_no() {
        return this.scale_no;
    }
    public void setScale_no(int scale_no) {
        this.scale_no = scale_no;
    }
    public int getIs_name_sync() {
        return this.is_name_sync;
    }
    public void setIs_name_sync(int is_name_sync) {
        this.is_name_sync = is_name_sync;
    }
    public String getScale_ip() {
        return this.scale_ip;
    }
    public void setScale_ip(String scale_ip) {
        this.scale_ip = scale_ip;
    }
    public int getScale_port() {
        return this.scale_port;
    }
    public void setScale_port(int scale_port) {
        this.scale_port = scale_port;
    }
    public int getIs_no_last_ip() {
        return this.is_no_last_ip;
    }
    public void setIs_no_last_ip(int is_no_last_ip) {
        this.is_no_last_ip = is_no_last_ip;
    }
    public int getIs_transmit() {
        return this.is_transmit;
    }
    public void setIs_transmit(int is_transmit) {
        this.is_transmit = is_transmit;
    }
    public int getIs_enabled() {
        return this.is_enabled;
    }
    public void setIs_enabled(int is_enabled) {
        this.is_enabled = is_enabled;
    }
    public int getIs_locked() {
        return this.is_locked;
    }
    public void setIs_locked(int is_locked) {
        this.is_locked = is_locked;
    }
    public int getDelete_flag() {
        return this.delete_flag;
    }
    public void setDelete_flag(int delete_flag) {
        this.delete_flag = delete_flag;
    }
    public int getTicket_no() {
        return this.ticket_no;
    }
    public void setTicket_no(int ticket_no) {
        this.ticket_no = ticket_no;
    }
    public int getIs_monitored() {
        return this.is_monitored;
    }
    public void setIs_monitored(int is_monitored) {
        this.is_monitored = is_monitored;
    }
    public int getMonitor_flag() {
        return this.monitor_flag;
    }
    public void setMonitor_flag(int monitor_flag) {
        this.monitor_flag = monitor_flag;
    }
    public int getIs_readonly() {
        return this.is_readonly;
    }
    public void setIs_readonly(int is_readonly) {
        this.is_readonly = is_readonly;
    }
    public int getCreator() {
        return this.creator;
    }
    public void setCreator(int creator) {
        this.creator = creator;
    }
    public Timestamp getC_datetime() {
        return this.c_datetime;
    }
    public void setC_datetime(Timestamp c_datetime) {
        this.c_datetime = c_datetime;
    }
    public String getScale_type() {
        return this.scale_type;
    }
    public void setScale_type(String scale_type) {
        this.scale_type = scale_type;
    }
    public String getSub_type() {
        return this.sub_type;
    }
    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }
    public String getConn_type() {
        return this.conn_type;
    }
    public void setConn_type(String conn_type) {
        this.conn_type = conn_type;
    }
    public int getC_location() {
        return this.c_location;
    }
    public void setC_location(int c_location) {
        this.c_location = c_location;
    }
    public Timestamp getM_datetime() {
        return this.m_datetime;
    }
    public void setM_datetime(Timestamp m_datetime) {
        this.m_datetime = m_datetime;
    }
    
    @Override
    public String getTable() {
        return "t_scale";
    }
    
    ArrayList<Integer> objects = new ArrayList<>();
    public ArrayList<Integer> get() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
         objects.getClass().getMethod("add", Object.class).invoke(objects, "asd");
         return objects;
    }
    
    public static void main(String[] args){
        //ArrayList<Integer> objects = new ArrayList<>();
        //objects.getClass().getMethod("add", Object.class).invoke(objects, "asd");
       try {
           Object object = new String();
           Object obj = new Object();
           System.out.println(obj.equals(object));
           String string = new String();//object,obj属性是一样的,string属性是不一样的
           for(Object i : new Tscale().get()){
               System.out.println(i);
           }
           
           System.out.println();
    } catch (Exception e) {
        e.printStackTrace();
    }
        
    }
    
}
