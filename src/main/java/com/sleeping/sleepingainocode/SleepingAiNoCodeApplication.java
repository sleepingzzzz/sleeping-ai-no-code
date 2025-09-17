package com.sleeping.sleepingainocode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sleeping.sleepingainocode.mapper")
public class SleepingAiNoCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleepingAiNoCodeApplication.class, args);
    }

}
