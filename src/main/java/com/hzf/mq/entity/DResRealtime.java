package com.hzf.mq.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DResRealtime {
    private Integer ID;

    private String TS_NO;

    private String LINE;

    private String LANE;

    private String LICENSE;

    private String LICENSE_CODE;

    private String LICENSE_TYPE;

    private String VEHICAL_COLOR;

    private String VEHICAL_TYPE;

    private Integer FUEL_TYPE;

    private Date MONITOR_TIME;

    private Integer RESULT;

    private String CS;

    private String JSD;

    private String CSCD;

    private String CO2;

    private Double CO;

    private String CO_LIMIT;

    private Integer CO_JUDG;

    private String HC;

    private String HC_LIMIT;

    private Integer HC_JUDG;

    private String NO;

    private String NO_LIMIT;

    private String NO_JUDG;

    private BigDecimal CO_CO2;

    private BigDecimal HC_CO2;

    private BigDecimal NO_CO2;

    private String SMOKE;

    private String SMOKE_LIMIT;

    private Integer SMOKE_JUDG;

    private BigDecimal VSP;

    private String WIND_SPEED;

    private Float WIND_DIRECTION;

    private String TEMPERATURE;

    private String HUMIDITY;

    private String ATMOSPHERE;

    private String OAC;

    private String CONFIDENCE;

    private Integer VALIDITY;

    private Date CREATED_TIME;

    private String CREATED_USER;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTS_NO() {
        return TS_NO;
    }

    public void setTS_NO(String TS_NO) {
        this.TS_NO = TS_NO == null ? null : TS_NO.trim();
    }

    public String getLINE() {
        return LINE;
    }

    public void setLINE(String LINE) {
        this.LINE = LINE == null ? null : LINE.trim();
    }

    public String getLANE() {
        return LANE;
    }

    public void setLANE(String LANE) {
        this.LANE = LANE == null ? null : LANE.trim();
    }

    public String getLICENSE() {
        return LICENSE;
    }

    public void setLICENSE(String LICENSE) {
        this.LICENSE = LICENSE == null ? null : LICENSE.trim();
    }

    public String getLICENSE_CODE() {
        return LICENSE_CODE;
    }

    public void setLICENSE_CODE(String LICENSE_CODE) {
        this.LICENSE_CODE = LICENSE_CODE == null ? null : LICENSE_CODE.trim();
    }

    public String getLICENSE_TYPE() {
        return LICENSE_TYPE;
    }

    public void setLICENSE_TYPE(String LICENSE_TYPE) {
        this.LICENSE_TYPE = LICENSE_TYPE == null ? null : LICENSE_TYPE.trim();
    }

    public String getVEHICAL_COLOR() {
        return VEHICAL_COLOR;
    }

    public void setVEHICAL_COLOR(String VEHICAL_COLOR) {
        this.VEHICAL_COLOR = VEHICAL_COLOR == null ? null : VEHICAL_COLOR.trim();
    }

    public String getVEHICAL_TYPE() {
        return VEHICAL_TYPE;
    }

    public void setVEHICAL_TYPE(String VEHICAL_TYPE) {
        this.VEHICAL_TYPE = VEHICAL_TYPE == null ? null : VEHICAL_TYPE.trim();
    }

    public Integer getFUEL_TYPE() {
        return FUEL_TYPE;
    }

    public void setFUEL_TYPE(Integer FUEL_TYPE) {
        this.FUEL_TYPE = FUEL_TYPE;
    }

    public Date getMONITOR_TIME() {
        return MONITOR_TIME;
    }

    public void setMONITOR_TIME(Date MONITOR_TIME) {
        this.MONITOR_TIME = MONITOR_TIME;
    }

    public Integer getRESULT() {
        return RESULT;
    }

    public void setRESULT(Integer RESULT) {
        this.RESULT = RESULT;
    }

    public String getCS() {
        return CS;
    }

    public void setCS(String CS) {
        this.CS = CS == null ? null : CS.trim();
    }

    public String getJSD() {
        return JSD;
    }

    public void setJSD(String JSD) {
        this.JSD = JSD == null ? null : JSD.trim();
    }

    public String getCSCD() {
        return CSCD;
    }

    public void setCSCD(String CSCD) {
        this.CSCD = CSCD == null ? null : CSCD.trim();
    }

    public String getCO2() {
        return CO2;
    }

    public void setCO2(String CO2) {
        this.CO2 = CO2 == null ? null : CO2.trim();
    }

    public Double getCO() {
        return CO;
    }

    public void setCO(Double CO) {
        this.CO = CO;
    }

    public String getCO_LIMIT() {
        return CO_LIMIT;
    }

    public void setCO_LIMIT(String CO_LIMIT) {
        this.CO_LIMIT = CO_LIMIT == null ? null : CO_LIMIT.trim();
    }

    public Integer getCO_JUDG() {
        return CO_JUDG;
    }

    public void setCO_JUDG(Integer CO_JUDG) {
        this.CO_JUDG = CO_JUDG;
    }

    public String getHC() {
        return HC;
    }

    public void setHC(String HC) {
        this.HC = HC == null ? null : HC.trim();
    }

    public String getHC_LIMIT() {
        return HC_LIMIT;
    }

    public void setHC_LIMIT(String HC_LIMIT) {
        this.HC_LIMIT = HC_LIMIT == null ? null : HC_LIMIT.trim();
    }

    public Integer getHC_JUDG() {
        return HC_JUDG;
    }

    public void setHC_JUDG(Integer HC_JUDG) {
        this.HC_JUDG = HC_JUDG;
    }

    public String getNO() {
        return NO;
    }

    public void setNO(String NO) {
        this.NO = NO == null ? null : NO.trim();
    }

    public String getNO_LIMIT() {
        return NO_LIMIT;
    }

    public void setNO_LIMIT(String NO_LIMIT) {
        this.NO_LIMIT = NO_LIMIT == null ? null : NO_LIMIT.trim();
    }

    public String getNO_JUDG() {
        return NO_JUDG;
    }

    public void setNO_JUDG(String NO_JUDG) {
        this.NO_JUDG = NO_JUDG == null ? null : NO_JUDG.trim();
    }

    public BigDecimal getCO_CO2() {
        return CO_CO2;
    }

    public void setCO_CO2(BigDecimal CO_CO2) {
        this.CO_CO2 = CO_CO2;
    }

    public BigDecimal getHC_CO2() {
        return HC_CO2;
    }

    public void setHC_CO2(BigDecimal HC_CO2) {
        this.HC_CO2 = HC_CO2;
    }

    public BigDecimal getNO_CO2() {
        return NO_CO2;
    }

    public void setNO_CO2(BigDecimal NO_CO2) {
        this.NO_CO2 = NO_CO2;
    }

    public String getSMOKE() {
        return SMOKE;
    }

    public void setSMOKE(String SMOKE) {
        this.SMOKE = SMOKE == null ? null : SMOKE.trim();
    }

    public String getSMOKE_LIMIT() {
        return SMOKE_LIMIT;
    }

    public void setSMOKE_LIMIT(String SMOKE_LIMIT) {
        this.SMOKE_LIMIT = SMOKE_LIMIT == null ? null : SMOKE_LIMIT.trim();
    }

    public Integer getSMOKE_JUDG() {
        return SMOKE_JUDG;
    }

    public void setSMOKE_JUDG(Integer SMOKE_JUDG) {
        this.SMOKE_JUDG = SMOKE_JUDG;
    }

    public BigDecimal getVSP() {
        return VSP;
    }

    public void setVSP(BigDecimal VSP) {
        this.VSP = VSP;
    }

    public String getWIND_SPEED() {
        return WIND_SPEED;
    }

    public void setWIND_SPEED(String WIND_SPEED) {
        this.WIND_SPEED = WIND_SPEED == null ? null : WIND_SPEED.trim();
    }

    public Float getWIND_DIRECTION() {
        return WIND_DIRECTION;
    }

    public void setWIND_DIRECTION(Float WIND_DIRECTION) {
        this.WIND_DIRECTION = WIND_DIRECTION;
    }

    public String getTEMPERATURE() {
        return TEMPERATURE;
    }

    public void setTEMPERATURE(String TEMPERATURE) {
        this.TEMPERATURE = TEMPERATURE == null ? null : TEMPERATURE.trim();
    }

    public String getHUMIDITY() {
        return HUMIDITY;
    }

    public void setHUMIDITY(String HUMIDITY) {
        this.HUMIDITY = HUMIDITY == null ? null : HUMIDITY.trim();
    }

    public String getATMOSPHERE() {
        return ATMOSPHERE;
    }

    public void setATMOSPHERE(String ATMOSPHERE) {
        this.ATMOSPHERE = ATMOSPHERE == null ? null : ATMOSPHERE.trim();
    }

    public String getOAC() {
        return OAC;
    }

    public void setOAC(String OAC) {
        this.OAC = OAC == null ? null : OAC.trim();
    }

    public String getCONFIDENCE() {
        return CONFIDENCE;
    }

    public void setCONFIDENCE(String CONFIDENCE) {
        this.CONFIDENCE = CONFIDENCE == null ? null : CONFIDENCE.trim();
    }

    public Integer getVALIDITY() {
        return VALIDITY;
    }

    public void setVALIDITY(Integer VALIDITY) {
        this.VALIDITY = VALIDITY;
    }

    public Date getCREATED_TIME() {
        return CREATED_TIME;
    }

    public void setCREATED_TIME(Date CREATED_TIME) {
        this.CREATED_TIME = CREATED_TIME;
    }

    public String getCREATED_USER() {
        return CREATED_USER;
    }

    public void setCREATED_USER(String CREATED_USER) {
        this.CREATED_USER = CREATED_USER == null ? null : CREATED_USER.trim();
    }
}