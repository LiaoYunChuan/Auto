package com.longruan.aotu.data.mq.upload;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.longruan.aotu.data.model.RealtimeData;
import com.longruan.aotu.data.mq.model.Head;
import com.longruan.aotu.data.mq.model.MQmsg;
import com.longruan.aotu.data.mq.model.PointRd;
import com.longruan.aotu.data.mq.send.SendService;
import com.longruan.aotu.data.service.RealDataService;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Service
public class UploadData {
    @Autowired
    private RealDataService realDataService;
    @Autowired
    private SendService sendService;

    public void upload(){
        List<PointRd> data=new ArrayList<>();
        QueryWrapper<RealtimeData> wrapper=new QueryWrapper<>();
        List<RealtimeData> list=realDataService.list(wrapper);
        MQmsg mQmsg=new MQmsg();
        Head head=new Head();
        head.setCompany_id("5223010007");
        head.setOrg_code("xxxxxxxxxxxxx");
        head.setUp_time("1546272000");
        mQmsg.setData(list);
        mQmsg.setHead(head);
        JsonConfig config = new JsonConfig();
        byte[] msg = JSONObject.fromObject(mQmsg,config).toString().getBytes(Charset.forName("UTF-8"));
        sendService.send("EX_DC_REALTIME_DATA",msg);
        System.out.println(msg);
    }
}
