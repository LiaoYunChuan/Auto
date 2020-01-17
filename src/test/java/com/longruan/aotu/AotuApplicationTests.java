package com.longruan.aotu;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.longruan.aotu.realData.model.RealData;
import com.longruan.aotu.realData.mq.config.DateJsonValueProcessor;
import com.longruan.aotu.realData.mq.model.MQmsg;
import com.longruan.aotu.realData.mq.send.SendService;
import com.longruan.aotu.realData.service.RealDataService;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class AotuApplicationTests {

    @Autowired
    private RealDataService realDataService;
    @Autowired
    private SendService sendService;

    @Test
    void contextLoads() {
        QueryWrapper<RealData> wrapper=new QueryWrapper<>();
        wrapper.eq("SystemName", "通风系统");
        List<RealData> list=realDataService.list(wrapper);
        System.out.println(list);
        JsonConfig config = new JsonConfig();
        MQmsg mQmsg=new MQmsg();
        mQmsg.setList(list);
        config.registerJsonValueProcessor(LocalDateTime.class,new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
        byte[] data = JSONObject.fromObject(mQmsg,config).toString().getBytes(Charset.forName("UTF-8"));
        sendService.send("EX_AUTO_RTDATA",data);
    }

}
