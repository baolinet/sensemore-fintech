package com.sensemore.loan.infra.remote;

import org.springframework.stereotype.Service;

import com.sensemore.loan.infra.remote.base.BaseInvoker;
import com.sensemore.loan.infra.remote.openai.ChatRequest;
import com.sensemore.loan.infra.remote.openai.ChatResponse;

@Service
public class ChatAiInvoker extends BaseInvoker{

    public ChatResponse chat(ChatRequest request) {
        return super.invoke(request);
    }
}
