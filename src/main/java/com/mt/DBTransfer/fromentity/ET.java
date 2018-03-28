package com.mt.DBTransfer.fromentity;

import java.util.Date;

public class ET {
    private int ID;
    private int EX_NO;
    private int DELETE_FLAG;
    private Date C_DATETIME;
    private String C_USEROID;
    private Date M_DATETIME;
    private String M_USEROID;
    private int DEPARTMENT_NO;
    private String EX_TEXT;
    private int EX_INDEX;
    private int EX_FONT;
    public int getID() {
        return this.ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public int getEX_NO() {
        return this.EX_NO;
    }
    public void setEX_NO(int eX_NO) {
        this.EX_NO = eX_NO;
    }
    public int getDELETE_FLAG() {
        return this.DELETE_FLAG;
    }
    public void setDELETE_FLAG(int dELETE_FLAG) {
        this.DELETE_FLAG = dELETE_FLAG;
    }
    public Date getC_DATETIME() {
        return this.C_DATETIME;
    }
    public void setC_DATETIME(Date c_DATETIME) {
        this.C_DATETIME = c_DATETIME;
    }
    public String getC_USEROID() {
        return this.C_USEROID;
    }
    public void setC_USEROID(String c_USEROID) {
        this.C_USEROID = c_USEROID;
    }
    public Date getM_DATETIME() {
        return this.M_DATETIME;
    }
    public void setM_DATETIME(Date m_DATETIME) {
        this.M_DATETIME = m_DATETIME;
    }
    public String getM_USEROID() {
        return this.M_USEROID;
    }
    public void setM_USEROID(String m_USEROID) {
        this.M_USEROID = m_USEROID;
    }
    public int getDEPARTMENT_NO() {
        return this.DEPARTMENT_NO;
    }
    public void setDEPARTMENT_NO(int dEPARTMENT_NO) {
        this.DEPARTMENT_NO = dEPARTMENT_NO;
    }
    public String getEX_TEXT() {
        return this.EX_TEXT;
    }
    public void setEX_TEXT(String eX_TEXT) {
        this.EX_TEXT = eX_TEXT;
    }
    public int getEX_INDEX() {
        return this.EX_INDEX;
    }
    public void setEX_INDEX(int eX_INDEX) {
        this.EX_INDEX = eX_INDEX;
    }
    public int getEX_FONT() {
        return this.EX_FONT;
    }
    public void setEX_FONT(int eX_FONT) {
        this.EX_FONT = eX_FONT;
    }

    
}
