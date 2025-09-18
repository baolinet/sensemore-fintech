package com.sensemore.loan.domain.ai_core.convertor;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.sensemore.loan.domain.ai_core.model.AgentModel;
import com.sensemore.loan.infra.mysql.entity.LLMModel;

@Mapper
public interface AgentModelConvertor {
    // ModelConverter INSTANCE = Mappers.getMapper( ModelConverter.class );

    @Mapping(target = "apiKey", source = "key")
    AgentModel toModel(LLMModel llmModel);

    LLMModel toEntity(AgentModel agentModel);
}
