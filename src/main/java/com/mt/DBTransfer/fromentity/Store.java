package com.mt.DBTransfer.fromentity;

import com.mt.DBTransfer.annotation.Column;

public class Store {
    
    @Column(value = "STORE_NO")
    private int STORE_NO;
    
    @Column(value = "STORE_NAME")
    private String STORE_NAME;
    
    @Column(value = "STORE_IP")
    private String STORE_IP;
    
    @Column(value = "STORE_PHONE")
    private String STORE_PHONE;
    
    @Column(value = "STORE_ADDRESS")
    private String STORE_ADDRESS;
    
    @Column(value = "STORE_MEMO")
    private String STORE_MEMO;
    
    @Column(value = "STORE_CONNECTER")
    private String STORE_CONNECTER;
    
    public int getSTORE_NO() {
        return this.STORE_NO;
    }
    public void setSTORE_NO(int sTORE_NO) {
        this.STORE_NO = sTORE_NO;
    }
    public String getSTORE_NAME() {
        return this.STORE_NAME;
    }
    public void setSTORE_NAME(String sTORE_NAME) {
        this.STORE_NAME = sTORE_NAME;
    }
    public String getSTORE_IP() {
        return this.STORE_IP;
    }
    public void setSTORE_IP(String sTORE_IP) {
        this.STORE_IP = sTORE_IP;
    }
    public String getSTORE_PHONE() {
        return this.STORE_PHONE;
    }
    public void setSTORE_PHONE(String sTORE_PHONE) {
        this.STORE_PHONE = sTORE_PHONE;
    }
    public String getSTORE_ADDRESS() {
        return this.STORE_ADDRESS;
    }
    public void setSTORE_ADDRESS(String sTORE_ADDRESS) {
        this.STORE_ADDRESS = sTORE_ADDRESS;
    }
    public String getSTORE_MEMO() {
        return this.STORE_MEMO;
    }
    public void setSTORE_MEMO(String sTORE_MEMO) {
        this.STORE_MEMO = sTORE_MEMO;
    }
    public String getSTORE_CONNECTER() {
        return this.STORE_CONNECTER;
    }
    public void setSTORE_CONNECTER(String sTORE_CONNECTER) {
        this.STORE_CONNECTER = sTORE_CONNECTER;
    }

    
}
