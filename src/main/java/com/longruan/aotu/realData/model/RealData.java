package com.longruan.aotu.realData.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

@TableName("NomalRealtimeData3D")
public class RealData {
    @TableField(value = "sensorId")
    private String sensorId;
    @TableField(value = "sensorType")
    private String sensorType;
    @TableField(value = "sensorLocation")
    private String sensorLocation;
    @TableField(value = "sensorValue")
    private String sensorValue;
    @TableField(value = "state")
    private String state;
    @TableField(value = "systemName")
    private String systemName;
    @TableField(value = "mineName")
    private String mineName;
    @TableField(value = "isImportant")
    private String isImportant;
    @TableField(value = "upDateTime")
    private String upDateTime;
    @TableField(value = "systemType")
    private String systemType;
    @TableField(value = "deptID")
    private String deptID;

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getSensorLocation() {
        return sensorLocation;
    }

    public void setSensorLocation(String sensorLocation) {
        this.sensorLocation = sensorLocation;
    }

    public String getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(String sensorValue) {
        this.sensorValue = sensorValue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getMineName() {
        return mineName;
    }

    public void setMineName(String mineName) {
        this.mineName = mineName;
    }

    public String getIsImportant() {
        return isImportant;
    }

    public void setIsImportant(String isImportant) {
        this.isImportant = isImportant;
    }

    public String getUpDateTime() {
        return upDateTime;
    }

    public void setUpDateTime(String upDateTime) {
        this.upDateTime = upDateTime;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getDeptID() {
        return deptID;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }
}
