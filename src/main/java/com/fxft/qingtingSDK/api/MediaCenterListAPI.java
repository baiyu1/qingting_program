package com.fxft.qingtingSDK.api;

import com.fxft.qingtingSDK.bean.mediacenterlist.MediaCenterList;
import com.fxft.qingtingSDK.client.LocalHttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

/**
 * 获取音频流域名中心数据。域名中心提供合成播放流的必要信息，包括流地址合成规则、流域名、测试地址等等。
 */
public class MediaCenterListAPI {
    public MediaCenterList getMediaCenterList(String access_token){
        HttpUriRequest request= RequestBuilder
                .get()
                .get()
                .setUri("http://api.open.qingting.fm/v6/media/mediacenterlist")
                .addParameter("access_token",access_token)
                .build();
       return LocalHttpClient.executeJsonResponse(request,MediaCenterList.class);
    }
}
