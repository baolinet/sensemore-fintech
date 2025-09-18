package com.sensemore.loan.infra.remote.cartoon;

import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Data;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sensemore.loan.infra.remote.base.BaseResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // 关键注解
public class CartoonResponse extends BaseResponse {
    private String status;
    @JsonAlias("data")
    private CartoonData cartoonData;

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true) // 关键注解
    public static class CartoonData {
        private String content;
        private Anime anime;
        private Character character;
    }

    @lombok.Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true) // 关键注解
    public static class Anime {
        private String id;
        private String name;
        private String altName;
    }

    @lombok.Data    
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true) // 关键注解
    public static class Character {
        private String id;
        private String name;
    }
}
