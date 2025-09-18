package com.sensemore.loan.domain.ai_core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.chat.prompt.SystemPromptTemplate;
import org.springframework.ai.chat.messages.Message;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OllamaAIService {
    private final ChatClient chatClient;
 
    public OllamaAIService(ChatClient.Builder builder) {
        chatClient = builder.build();
    }
 
    public String testAiCall(String storyTopic) {
        log.info("Invoking LLM");

        PromptTemplate systemPromptTemplate = new SystemPromptTemplate("你是一个擅长讲中国古典故事的高手，请你用 {voice} 的语言风格回复用户的请求。");
        PromptTemplate userPromptTemplate = new PromptTemplate("请给我讲一个关于{topic}主题的故事");

        List<Message> messages = new ArrayList<>();
        messages.add(systemPromptTemplate.createMessage(Map.of("voice", "惊悚恐怖")));
        messages.add(userPromptTemplate.createMessage(Map.of("topic", storyTopic)));
 
        Prompt prompt = new Prompt(messages);

        String answer = chatClient.prompt(prompt).call().content();
        return answer;
    }
}
