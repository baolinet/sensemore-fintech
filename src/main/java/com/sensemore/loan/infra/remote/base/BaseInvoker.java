package com.sensemore.loan.infra.remote.base;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sensemore.loan.infra.remote.base.BaseRequest.RequestTypeEnum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseInvoker {

    private Logger logger = LoggerFactory.getLogger(BaseInvoker.class);
    private final HttpClient client = HttpClient.newHttpClient();
    private ObjectMapper mapper = new ObjectMapper();

    public <T extends BaseResponse> T invoke(BaseRequest<T> request) {

        try {
            String result = "";
            if (request.getRequestType() == RequestTypeEnum.GET) {
                result = getString(request.getBaseUrl(), request.getApiKey());
                logger.info("result: {}", result);
                logger.info("responseClass: {}", request.responseClass());
                T response = mapper.readValue(result, request.responseClass());
                return response;
            } else if (request.getRequestType() == RequestTypeEnum.POST) {
                result = postString(request.getBaseUrl(), request.getApiKey(), mapper.writeValueAsString(request));
                logger.info("result: {}", result);
                logger.info("responseClass: {}", request.responseClass());
                T response = mapper.readValue(result, request.responseClass());
                return response;
            } else {
                throw new RuntimeException("不支持的请求类型");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("请求失败: " + e.getMessage());
        }
    }

    private String getString(String url, String token) throws IOException, InterruptedException {

        // 2. 创建GET请求
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json, text/plain, */*") // 接受多种响应类型
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .GET() // 默认GET方法
                .build();

        // 3. 发送请求并获取响应
        HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return response.body();
    }

    private String postString(String url, String token, String json) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
