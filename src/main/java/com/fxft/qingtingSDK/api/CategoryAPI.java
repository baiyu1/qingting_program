package com.fxft.qingtingSDK.api;

import com.fxft.qingtingSDK.bean.category.CategoryData;
import com.fxft.qingtingSDK.bean.category.Category_properties;
import com.fxft.qingtingSDK.bean.category.Recommend.Recommend;
import com.fxft.qingtingSDK.bean.channnel.ChannelList;
import com.fxft.qingtingSDK.client.LocalHttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;


/**
 * 通过分类属性获取数据
 *
 * @author ywr
 */
public class CategoryAPI {
    /**
     * 获取点播的所有分类
     *
     * @param access_token
     * @return
     */
    public CategoryData getCategories(String access_token) {
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BaseAPI.MediaURL+"categories")
                .addParameter("access_token", access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request, CategoryData.class);
    }

    /**
     * 获取指定分类的属性
     *
     * @param access_token
     * @param id           属性的列表id
     * @return
     */
    public Category_properties getProperties(String access_token, int id) {
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BaseAPI.MediaURL+"categories/" + id)
                .addParameter("access_token", access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request, Category_properties.class);
    }

    /**
     * 直播分类及获取直播属性 设置id为5
     *
     * @param access_token
     * @return
     */
    public Category_properties getProperties(String access_token) {
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BaseAPI.MediaURL+"categories/5")
                .addParameter("access_token", access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request, Category_properties.class);
    }

    /**
     * 获取分类下的所有电台
     *
     * @param access_token
     * @param category_id
     * @param curpage
     * @return
     */
    public ChannelList getChannel(String access_token, int category_id, int curpage) {
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BaseAPI.MediaURL+"categories/" + category_id + "/channels/order/0/curpage/"+curpage+"/pagesize/30")
                .addParameter("access_token", access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request, ChannelList.class);
    }

    /**
     * 属性筛选电台
     *
     * @param access_token
     * @param curpage
     * @param category_id
     * @param attr
     * @return
     */
    public ChannelList getChannel(String access_token, String curpage, String category_id, int[] attr) {
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BaseAPI.MediaURL + "categories/" + category_id
                        + "/channels/order/0/attr/" + attr +
                        "/curpage/" + curpage + "/pagesize/30")
                .addParameter("access_token", access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request, ChannelList.class);
    }

    /**
     * 获取点播分类推荐
     * @param access_token
     * @param section_id
     * @return
     */
    public Recommend getRecommend(String access_token, String section_id){
        HttpUriRequest request=RequestBuilder.get()
                .setUri(BaseAPI.BaseURL+"/v6/mediarecommends/guides/section/"+section_id)
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,Recommend.class);
    }
}
