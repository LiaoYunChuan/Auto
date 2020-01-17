package com.longruan.aotu.realData.mq.schedule;

import com.longruan.aotu.realData.mq.upload.UploadData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RealDataSchedule {

    @Autowired
    private UploadData uploadData;

    @Scheduled(cron="0/10 * * * * ?")
    public void doUpload() {
        uploadData.upload();
    }
}
