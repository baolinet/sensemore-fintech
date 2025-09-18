package com.sensemore.loan.infra.remote.base;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter()
@Setter()
public abstract class BaseRequest<T extends BaseResponse> {

    @JsonIgnore
    private String baseUrl;
    @JsonIgnore
    private String apiKey;
    @JsonIgnore
    private RequestTypeEnum requestType;

    public abstract Class<T> responseClass();

    public static enum RequestTypeEnum {
        POST, GET;
    }
}
