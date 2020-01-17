package com.longruan.aotu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AotuApplication {

    public static void main(String[] args) {
        SpringApplication.run(AotuApplication.class, args);
    }

}
