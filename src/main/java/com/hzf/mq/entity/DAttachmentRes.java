package com.hzf.mq.entity;

import java.util.Date;

public class DAttachmentRes {
    private Integer ID;

    private Integer RES_ID;

    private Integer TYPE;

    private String NAME;

    private String FILE_PATH;

    private String EXTENSION;

    private String SIZE;

    private String MD5;

    private String CREATED_USER;

    private Date CREATED_TIME;

    private String UPDATED_USER;

    private Date UPDATED_TIME;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getRES_ID() {
        return RES_ID;
    }

    public void setRES_ID(Integer RES_ID) {
        this.RES_ID = RES_ID;
    }

    public Integer getTYPE() {
        return TYPE;
    }

    public void setTYPE(Integer TYPE) {
        this.TYPE = TYPE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getFILE_PATH() {
        return FILE_PATH;
    }

    public void setFILE_PATH(String FILE_PATH) {
        this.FILE_PATH = FILE_PATH == null ? null : FILE_PATH.trim();
    }

    public String getEXTENSION() {
        return EXTENSION;
    }

    public void setEXTENSION(String EXTENSION) {
        this.EXTENSION = EXTENSION == null ? null : EXTENSION.trim();
    }

    public String getSIZE() {
        return SIZE;
    }

    public void setSIZE(String SIZE) {
        this.SIZE = SIZE == null ? null : SIZE.trim();
    }

    public String getMD5() {
        return MD5;
    }

    public void setMD5(String MD5) {
        this.MD5 = MD5 == null ? null : MD5.trim();
    }

    public String getCREATED_USER() {
        return CREATED_USER;
    }

    public void setCREATED_USER(String CREATED_USER) {
        this.CREATED_USER = CREATED_USER == null ? null : CREATED_USER.trim();
    }

    public Date getCREATED_TIME() {
        return CREATED_TIME;
    }

    public void setCREATED_TIME(Date CREATED_TIME) {
        this.CREATED_TIME = CREATED_TIME;
    }

    public String getUPDATED_USER() {
        return UPDATED_USER;
    }

    public void setUPDATED_USER(String UPDATED_USER) {
        this.UPDATED_USER = UPDATED_USER == null ? null : UPDATED_USER.trim();
    }

    public Date getUPDATED_TIME() {
        return UPDATED_TIME;
    }

    public void setUPDATED_TIME(Date UPDATED_TIME) {
        this.UPDATED_TIME = UPDATED_TIME;
    }
}