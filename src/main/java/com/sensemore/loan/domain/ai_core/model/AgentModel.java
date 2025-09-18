package com.sensemore.loan.domain.ai_core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgentModel {
    private String modelType;
    private String modelId;
    private String modelName;
    private String baseUrl;
    private String apiKey;
    private String status;
}
