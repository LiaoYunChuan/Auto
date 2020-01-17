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

    @Value("${mineId}")
    private String mineId;

    private static Map<String,String> map=new HashMap<>();

    static {
        map.put("","功率因数");
        map.put("A","电流");
        map.put("℃","温度");
        map.put("HZ","频率");
        map.put("KW","功率");
        map.put("m/s","风速");
        map.put("m3/min","风量");
        map.put("m3/s","风量");
        map.put("mm/s","振动");
        map.put("Pa","负压");
        map.put("r/min","转速");
        map.put("V","电压");
    }

    public void upload(){
        List<PointRd> data=new ArrayList<>();
        QueryWrapper<RealtimeData> wrapper=new QueryWrapper<>();
        List<RealtimeData> list=realDataService.list(wrapper);
        /*if (!CollectionUtils.isEmpty(list)){
            list.forEach(it->{
                String sensorType=it.getSensorType();
                if (map.containsKey(sensorType)){
                    PointRd pointRd = new PointRd();
                    pointRd.setMine_id(mineId);
                    pointRd.setReal_value(it.getSensorValue().equals("None")?null:Float.valueOf(it.getSensorValue()));
                    pointRd.setSensor_id(it.getSensorId());
                    pointRd.setSnap_time(it.getUpDateTime().replace(" ","/"));
                    pointRd.setSensor_status(it.getState().equals("Good")?"0":"1");
                    data.add(pointRd);
                }
            });
        }*/
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
