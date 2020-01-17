package com.longruan.aotu.realData.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName RealtimeData 实时数据
 * @Description RealtimeData
 * @Author LiaoYunChuan
 * @Date 2020/1/15 9:13
 * @Version 1.0
 */
@TableName("zgq_realtime_data")
public class RealtimeData {
    private String id;
    private String companyname;
    private String location;
    private String chemicalname;
    private String toxicity;
    private String sensorno;
    private String sensortype;
    private String realvalue;
    private String time;
    private String status;
    private String companyid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getChemicalname() {
        return chemicalname;
    }

    public void setChemicalname(String chemicalname) {
        this.chemicalname = chemicalname;
    }

    public String getToxicity() {
        return toxicity;
    }

    public void setToxicity(String toxicity) {
        this.toxicity = toxicity;
    }

    public String getSensorno() {
        return sensorno;
    }

    public void setSensorno(String sensorno) {
        this.sensorno = sensorno;
    }

    public String getSensortype() {
        return sensortype;
    }

    public void setSensortype(String sensortype) {
        this.sensortype = sensortype;
    }

    public String getRealvalue() {
        return realvalue;
    }

    public void setRealvalue(String realvalue) {
        this.realvalue = realvalue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }


}
