package com.longruan.aotu.data.mq.model;

import java.io.Serializable;

public class PointRd implements Serializable {
    private static final long serialVersionUID = 1L;
    private String mine_id;//矿编码
    private String point_code;//机器编码
    private String sensor_id;//传感器编码
    private Float real_value;//监测值
    private String snap_time;//监测时间
    private String sensor_status;//分类

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
    }

    public String getPoint_code() {
        return point_code;
    }

    public void setPoint_code(String point_code) {
        this.point_code = point_code;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public Float getReal_value() {
        return real_value;
    }

    public void setReal_value(Float real_value) {
        this.real_value = real_value;
    }

    public String getSnap_time() {
        return snap_time;
    }

    public void setSnap_time(String snap_time) {
        this.snap_time = snap_time;
    }

    public String getSensor_status() {
        return sensor_status;
    }

    public void setSensor_status(String sensor_status) {
        this.sensor_status = sensor_status;
    }
}
