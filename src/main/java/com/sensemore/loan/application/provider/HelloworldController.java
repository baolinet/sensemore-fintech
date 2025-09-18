package com.sensemore.loan.application.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sensemore.loan.domain.ai_core.service.OllamaAIService;
import com.sensemore.loan.domain.ai_core.service.OpenAIService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloworldController {

    @Autowired
    private OpenAIService openAIService;

    @Value("${ai.api.url}")
    private String apiUrl;

    @Autowired
    private OllamaAIService ollamaAIService;
    
    @GetMapping("/ai")
    public String ai(@RequestParam("message") String storyTopic){
        try {
            return ollamaAIService.testAiCall(storyTopic);
        } catch (Exception e) {
            return "AI调用失败: " + e.getMessage();
        }
    }

    @GetMapping("/chat")
    public String chat() {
        
        String content = openAIService.chat("天空为什么是蓝色的？");
        return content;

        // return "API URL: " + apiUrl;
    }

    @GetMapping("/cartoon")
    public String cartoon() {
        String content = openAIService.cartoon();
        return content;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
}