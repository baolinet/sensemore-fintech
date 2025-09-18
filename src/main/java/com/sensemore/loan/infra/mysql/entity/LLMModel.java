package com.sensemore.loan.infra.mysql.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class LLMModel {
    private Long id;
    private String key;
    private String value;

    private String group;
    private String belong;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public static enum Provider {
        OPENAI, OLLAMA, CHATGPT;
    }
}
