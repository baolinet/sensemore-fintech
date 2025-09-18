package com.sensemore.loan.domain.ai_core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sensemore.loan.infra.remote.CartoonInvoker;
import com.sensemore.loan.infra.remote.ChatAiInvoker;
import com.sensemore.loan.infra.remote.base.BaseRequest.RequestTypeEnum;
import com.sensemore.loan.infra.remote.cartoon.CartoonRequest;
import com.sensemore.loan.infra.remote.openai.ChatRequest;
import com.sensemore.loan.infra.remote.openai.ChatResponse;

import org.springframework.beans.factory.annotation.Value;


@Service
public class OpenAIService {
    @Autowired
    private ChatAiInvoker chatAiInvoker;
    @Autowired
    private CartoonInvoker cartoonInvoker;

    @Value("${ai.api.url}")
    private String baseUrl;
    @Value("${ai.api.authToken}")
    private String apiKey;

    public String chat(String message) {
        ChatRequest chatRequest = new ChatRequest();
        chatRequest.setBaseUrl(baseUrl);
        chatRequest.setApiKey(apiKey);
        chatRequest.setRequestType(RequestTypeEnum.POST);

        chatRequest.setModel("gemma3:27b");
        chatRequest.setTemperature(0.6);
        chatRequest.setStream(false);
        chatRequest.getMessages().add(new ChatRequest.Message("user", message));

        ChatResponse response = chatAiInvoker.chat(chatRequest);
        return response.getChoices().get(0).getMessage().getContent();
    }

    public String cartoon() {
        CartoonRequest cartoonRequest = new CartoonRequest();
        cartoonRequest.setBaseUrl("https://api.animechan.io/v1/quotes/random");
        cartoonRequest.setRequestType(RequestTypeEnum.GET);

        return cartoonInvoker.cartoon(cartoonRequest).getCartoonData().getAnime().getAltName();
    }

}
