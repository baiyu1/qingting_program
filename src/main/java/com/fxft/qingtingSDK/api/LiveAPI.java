package com.fxft.qingtingSDK.api;

import com.fxft.qingtingSDK.bean.Program.LiveProgram;
import com.fxft.qingtingSDK.bean.Program.LiveProgramList;
import com.fxft.qingtingSDK.bean.channnel.ChannelList;
import com.fxft.qingtingSDK.client.HttpClientFactory;
import com.fxft.qingtingSDK.client.LocalHttpClient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * 直播api
 */
public class LiveAPI {
    private CloseableHttpClient httpClient = HttpClientFactory.createCloseableHttpClient();

    /**
     * 获取直播电台信息
     *
     * @param access_token
     * @param channel_id   直播电台ID
     * @return
     */
    public ChannelList getLive(String access_token, int channel_id) {
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BaseAPI.BaseURL + "wapi/channels/" + channel_id)
                .addParameter("access_token", access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request, ChannelList.class);
    }

    /**
     * 获取直播节目单
     *
     * @param access_token
     * @param channel_id
     * @param day_of_week
     * @return
     */
    public List<LiveProgram> getLiveProgram(String access_token, int channel_id, int day_of_week) {
        List<LiveProgram> list=new ArrayList<LiveProgram>();
        try {
            HttpUriRequest request = RequestBuilder.get()
                    .setUri("channellives/" + channel_id + "/programs/day/" + day_of_week)
                    .addParameter("access_token", access_token)
                    .build();
            HttpResponse response = httpClient.execute(request);
            String jsonString=EntityUtils.toString(response.getEntity());
            JsonObject jsonObject=new JsonParser().parse(jsonString).getAsJsonObject().get("1").getAsJsonObject();
            list =new Gson().fromJson(jsonObject, LiveProgramList.class).getLivePrograms();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
