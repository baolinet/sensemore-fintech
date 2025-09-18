package com.sensemore.loan.infra.remote.openai;

import java.util.ArrayList;
import java.util.List;

import com.sensemore.loan.infra.remote.base.BaseRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatRequest extends BaseRequest<ChatResponse> {

    private String model;          // 模型名称（如 "gemma3:27b"）
    private double temperature;    // 温度参数（0.6）
    private boolean stream;        // 是否流式响应（true）
    private List<Message> messages = new ArrayList<Message>();// 消息列表

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Message {
        private String role;   // 角色（"user"/"assistant"）
        private String content;// 消息内容
    }

    @Override
    public Class<ChatResponse> responseClass() {
        return ChatResponse.class;
    }
    
}
