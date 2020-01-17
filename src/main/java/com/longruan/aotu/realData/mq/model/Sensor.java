package com.longruan.aotu.realData.mq.model;

import java.io.Serializable;

public class Sensor implements Serializable {
    private static final long serialVersionUID = 1L;
    private String mine_id;
    private String sensor_name;
    private String sensor_id;
    private String sensor_type;
    private String point_type;
    private String point_cat;
    private String unit;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
    }

    public String getSensor_name() {
        return sensor_name;
    }

    public void setSensor_name(String sensor_name) {
        this.sensor_name = sensor_name;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getSensor_type() {
        return sensor_type;
    }

    public void setSensor_type(String sensor_type) {
        this.sensor_type = sensor_type;
    }

    public String getPoint_type() {
        return point_type;
    }

    public void setPoint_type(String point_type) {
        this.point_type = point_type;
    }

    public String getPoint_cat() {
        return point_cat;
    }

    public void setPoint_cat(String point_cat) {
        this.point_cat = point_cat;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
