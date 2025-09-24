package com.sleeping.sleepingainocode.ai;

import com.sleeping.sleepingainocode.ai.model.HtmlCodeResult;
import com.sleeping.sleepingainocode.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("做一个程序员 sleeping 的博客，代码不超过 50 行。");
        Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult result = aiCodeGeneratorService.generateMultiFileCode("做一个程序员 sleeping 的博客，代码不超过 50 行。");
        Assertions.assertNotNull(result);
    }
}