package com.longruan.aotu;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.longruan.aotu.data.model.RealtimeData;
import com.longruan.aotu.data.mq.config.DateJsonValueProcessor;
import com.longruan.aotu.data.mq.model.MQmsg;
import com.longruan.aotu.data.mq.send.SendService;
import com.longruan.aotu.data.service.RealDataService;
import com.longruan.aotu.data.util.MoneyUtil;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class AutoApplicationTests {

    @Autowired
    private RealDataService realDataService;
    @Autowired
    private SendService sendService;

    @Test
    void contextLoads() {
       /* QueryWrapper<RealtimeData> wrapper=new QueryWrapper<>();
        wrapper.eq("SystemName", "通风系统");
        List<RealtimeData> list=realDataService.list(wrapper);
        System.out.println(list);
        JsonConfig config = new JsonConfig();
        MQmsg mQmsg=new MQmsg();
        mQmsg.setData(list);
        config.registerJsonValueProcessor(LocalDateTime.class,new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
        byte[] data = JSONObject.fromObject(mQmsg,config).toString().getBytes(Charset.forName("UTF-8"));
        sendService.send("EX_AUTO_RTDATA",data);*/
        int money= MoneyUtil.summoney(3);
        System.out.println(money);
    }

}
