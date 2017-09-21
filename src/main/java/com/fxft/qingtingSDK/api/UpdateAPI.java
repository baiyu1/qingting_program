package com.fxft.qingtingSDK.api;

import com.fxft.qingtingSDK.bean.update.LiveUpDate;
import com.fxft.qingtingSDK.client.LocalHttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

public class UpdateAPI {
    /**
     * 获取更新状态的直播电台
     * @param access_token
     * @param starttime
     * @param endtime
     * @return
     */
    public LiveUpDate getLiveUpdate(String access_token,String starttime,String endtime){
        HttpUriRequest request= RequestBuilder.get()
                .setUri(BaseAPI.MediaURL+"categories/live/recent/channels/starttime/"+starttime+"/endtime/"+
                        endtime+"/curpage/#{curpage}/pagesize/#{pagesize}")
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,LiveUpDate.class);
    }
}
