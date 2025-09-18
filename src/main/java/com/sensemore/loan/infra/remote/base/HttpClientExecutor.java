package com.sensemore.loan.infra.remote.base;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.JsonSerializable.Base;

import io.netty.channel.ChannelOption;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

@Component
public class HttpClientExecutor {
    private Logger logger = LoggerFactory.getLogger(HttpClientExecutor.class);

    // public static <? extends BaseResponse> T execute(BaseRequest<T> request) {
    //     String result = "Hello ";
    //     return null;
    // }
    
    // /**
    //  * 处理贷款请求
    //  * @param loanRequest 贷款请求对象
    //  * @return 贷款响应对象
    //  */
    // public LoanResponse processLoanRequest(LoanRequest loanRequest) {
    //     String url = "https://api.loan-service.com/apply";
    //     String token = "your-auth-token";
        
    //     try {
    //         // 使用通用方法发送请求
    //         return webClientBuilder
    //             .filter((request, next) -> {
    //                 request.headers().add("Authorization", "Bearer " + token);
    //                 return next.exchange(request);
    //             })
    //             .build()
    //             .post()
    //             .uri(url)
    //             .bodyValue(loanRequest)
    //             .retrieve()
    //             .onStatus(status -> status.isError(), clientResponse -> 
    //                 Mono.error(new RuntimeException("贷款申请处理失败: " + clientResponse.statusCode())))
    //             .bodyToMono(LoanResponse.class)
    //             .block();
    //     } catch (Exception e) {
    //         LoanResponse errorResponse = new LoanResponse();
    //         errorResponse.setApproved(false);
    //         errorResponse.setMessage("处理请求时发生错误: " + e.getMessage());
    //         return errorResponse;
    //     }
    // }
    
    public WebClient getWebClient(String baseUrl, String authToken) {
        HttpClient httpClient = HttpClient.create()
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)  // 连接超时 5s
            .responseTimeout(Duration.ofSeconds(30));             // 响应超时 30s

        return WebClient.builder()
                .baseUrl(baseUrl)
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.AUTHORIZATION,authToken)
                .filter(logRequestFilter())  // 请求日志过滤器
                .filter(logResponseFilter()) // 响应日志过滤器
                .build();
    }

    private ExchangeFilterFunction logRequestFilter() {
        return (clientRequest, next) -> {
            logger.debug("Request: {} {}", clientRequest.method(), clientRequest.url());
            clientRequest.headers().forEach((name, values) -> 
                values.forEach(value -> logger.debug("{}={}", name, value))
            );
            return next.exchange(clientRequest);
        };
    }
    
    // 响应日志过滤器
    private ExchangeFilterFunction logResponseFilter() {
        return (clientRequest, next) -> next.exchange(clientRequest)
                .flatMap(clientResponse -> {
                    logger.debug("Response status: {}", clientResponse.statusCode());
                    clientResponse.headers().asHttpHeaders().forEach((name, values) -> 
                        values.forEach(value -> logger.debug("{}={}", name, value))
                    );
                    return Mono.just(clientResponse);
                });
    }
}
