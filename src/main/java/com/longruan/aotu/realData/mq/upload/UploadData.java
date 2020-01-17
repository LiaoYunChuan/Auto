package com.longruan.aotu.realData.mq.upload;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.longruan.aotu.realData.model.RealData;
import com.longruan.aotu.realData.model.RealtimeData;
import com.longruan.aotu.realData.mq.config.DateJsonValueProcessor;
import com.longruan.aotu.realData.mq.model.Head;
import com.longruan.aotu.realData.mq.model.MQmsg;
import com.longruan.aotu.realData.mq.model.PointRd;
import com.longruan.aotu.realData.mq.send.SendService;
import com.longruan.aotu.realData.service.RealDataService;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UploadData {
    @Autowired
    private RealDataService realDataService;
    @Autowired
    private SendService sendService;

    private static Map<String,String> map=new HashMap<>();


    public void upload(){
        List<PointRd> data=new ArrayList<>();
        QueryWrapper<RealtimeData> wrapper=new QueryWrapper<>();
        List<RealtimeData> list=realDataService.list(wrapper);
        MQmsg mQmsg=new MQmsg();
        Head head=new Head();
        head.setCompany_id("5223010007");
        mQmsg.setData(list);
        mQmsg.setHead(head);
        JsonConfig config = new JsonConfig();
        byte[] msg = JSONObject.fromObject(mQmsg,config).toString().getBytes(Charset.forName("UTF-8"));
        sendService.send("EX_DC_REALTIME_DATA",msg);
    }
}
