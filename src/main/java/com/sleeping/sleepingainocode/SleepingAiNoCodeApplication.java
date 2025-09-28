package com.sleeping.sleepingainocode;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.sleeping.sleepingainocode.mapper")
public class SleepingAiNoCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleepingAiNoCodeApplication.class, args);
    }

}
