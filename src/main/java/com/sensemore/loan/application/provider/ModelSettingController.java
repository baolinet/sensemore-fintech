package com.sensemore.loan.application.provider;

import org.springframework.web.bind.annotation.RestController;

import com.sensemore.loan.infra.mysql.entity.LLMModel;
import com.sensemore.loan.infra.mysql.repository.LLMModelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ModelSettingController {
    
    @Autowired
    private LLMModelRepository llmModelMapper;
    
    @GetMapping("/addModel")
    public String addModel() {
        LLMModel model = new LLMModel();
        model.setGroup("chatgroup");
        model.setKey("key01");
        model.setBelong("pay");
        model.setValue("value01");

        llmModelMapper.insert(model);
        return "Hello World!";
    }
    
}
