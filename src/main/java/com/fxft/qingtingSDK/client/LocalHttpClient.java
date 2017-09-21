package com.fxft.qingtingSDK.client;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;

public class LocalHttpClient {
    private static CloseableHttpClient httpClient=HttpClientFactory.createCloseableHttpClient();
    public static <T> T execute(HttpUriRequest request , ResponseHandler<T> responseHandler){
        try {
            T t=httpClient.execute(request,responseHandler, HttpClientContext.create());
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static <T> T executeJsonResponse(HttpUriRequest request,Class<T> clazz){
        return LocalHttpClient.execute(request,JsonResponseHandler.createResponseHandler(clazz));
    }
}
