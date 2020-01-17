package com.longruan.aotu.data.mq.model;

import com.longruan.aotu.data.model.RealtimeData;

import java.util.List;

public class MQmsg {
    private Head head;
    private List<RealtimeData> data;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public List<RealtimeData> getData() {
        return data;
    }

    public void setData(List<RealtimeData> data) {
        this.data = data;
    }
}
