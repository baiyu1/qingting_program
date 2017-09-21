package com.fxft.qingtingSDK.api;

import com.fxft.qingtingSDK.bean.token.Token;
import com.fxft.qingtingSDK.client.HttpClientFactory;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


import java.io.IOException;
import java.util.ArrayList;

/**
 * 获取通行证
 */
public class TokenAPI {
    /**
     * 获取token
     *
     * @param client_id
     * @param client_secret
     * @return
     */
    public Token getToken(String client_id, String client_secret) {
        HttpPost request = new HttpPost("http://api.open.qingting.fm/access?&grant_type=client_credentials");
        ArrayList nameValuePairs = new ArrayList(2);
        nameValuePairs.add(new BasicNameValuePair("client_id", "#{client_id}"));
        nameValuePairs.add(new BasicNameValuePair("client_secret", "#{client_secret}"));
        try {
            request.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse httpResponse = HttpClientFactory.createCloseableHttpClient().execute(request);
            HttpEntity entity=httpResponse.getEntity();
            String jsonString=EntityUtils.toString(entity);
            return new Gson().fromJson(jsonString, Token.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
