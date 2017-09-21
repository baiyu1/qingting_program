package com.fxft.qingtingSDK.client;

import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;

import javax.net.ssl.SSLException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;

public class HttpClientFactory {

    public static CloseableHttpClient createCloseableHttpClient(){
        return createCloseableHttpClient(200,20);
    }
    public static CloseableHttpClient createCloseableHttpClient(int MaxTotal, int DefaultMaxPerRoute) {
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("https", SSLConnectionSocketFactory.getSocketFactory())
                .register("http", PlainConnectionSocketFactory.getSocketFactory())
                .build();
        PoolingHttpClientConnectionManager connectionManager =
                new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        connectionManager.setMaxTotal(MaxTotal);
        connectionManager.setDefaultMaxPerRoute(DefaultMaxPerRoute);
        return HttpClients.custom().setRetryHandler(retryHandler).setConnectionManager(connectionManager).build();
    }
    static HttpRequestRetryHandler retryHandler=new HttpRequestRetryHandler() {
        public boolean retryRequest(IOException e, int i, HttpContext httpContext) {
            if (i > 2) {
                return false;
            }
            if (e instanceof InterruptedIOException) {
                return false;
            }
            if (e instanceof UnknownHostException) {
                return false;
            }
            if (e instanceof ConnectTimeoutException) {
                return true;
            }
            if (e instanceof SSLException) {
                return false;
            }
            HttpClientContext clientContext = HttpClientContext.adapt(httpContext);
            HttpRequest request = clientContext.getRequest();
            boolean idempotent = !(request instanceof HttpEntityEnclosingRequest);
            if (idempotent) {
                // Retry if the request is considered idempotent
                return true;
            }
            return false;
        }
    };
}
