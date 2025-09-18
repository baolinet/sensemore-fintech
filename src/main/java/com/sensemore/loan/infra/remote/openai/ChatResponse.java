package com.sensemore.loan.infra.remote.openai;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sensemore.loan.infra.remote.base.BaseResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // 关键注解
public class ChatResponse extends BaseResponse {
    private String id;                // 响应 ID
    private String model;             // 使用的模型
    private String object;            // 对象类型（如 "chat.completion.chunk"）
    private long created;             // 创建时间戳
    private List<Choice> choices;     // 消息块列表
    private Usage usage;                // 令牌使用情况

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true) // 关键注解
    public static class Choice {
        private int index;
        private String role;          // 角色（"assistant"）
        private Message message;       // 生成的内容
        private String finish_reason; // 结束原因（如 "stop"）
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true) // 关键注解
    public static class Usage {
        private int prompt_tokens;
        private int completion_tokens;
        private int total_tokens;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true) // 关键注解
    public static class Message {
        private String role;
        private String content;
    }
}
