package com.fxft.program.service;

import com.fxft.qingtingSDK.api.CategoryAPI;
import com.fxft.qingtingSDK.api.LiveAPI;
import com.fxft.qingtingSDK.api.UpdateAPI;
import com.fxft.qingtingSDK.bean.Program.LiveProgram;
import com.fxft.qingtingSDK.bean.category.Category;
import com.fxft.qingtingSDK.bean.category.CategoryData;
import com.fxft.qingtingSDK.bean.channnel.Channel;

import java.util.ArrayList;
import java.util.List;

/**
 * 电台服务
 */
public class ProgramService {
    private CategoryAPI categoryAPI = new CategoryAPI();
    private LiveAPI liveAPI = new LiveAPI();
    private UpdateAPI updateAPI=new UpdateAPI();

    /**
     * 获取分类id
     *
     * @param access_token
     * @returnc
     */
    public ArrayList<Integer> getCategorie_id(String access_token) {
        CategoryData data = categoryAPI.getCategories(access_token);
        List list = data.getCategories();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            Category category = (Category) list.get(i);
            ids.add(category.getId());
        }
        return ids;
    }

    /**
     * 获取点播电台或者专辑id
     *
     * @param access_token
     * @param list
     * @return
     */
    public ArrayList<Integer> getChannel_id(String access_token, ArrayList list) {
        ArrayList<Integer> channelId = new ArrayList<Integer>();
        for (int i = 0, len = list.size(); i < len; i++) {
            int category_id = (Integer) list.get(i);
            List<Channel> channelList = categoryAPI.getChannel(access_token, category_id, 1).getData();
            int j = 0;
            int length = channelList.size();
            for (j = 0; j < length; j++) {
                Channel channel = channelList.get(j);
                channelId.add(channel.getId());
            }
        }
        return channelId;
    }

    /**
     * 获取所有直播电台
     *
     * @param access_token
     * @return
     */
    public ArrayList<Integer> getChannel_id(String access_token) {
        ArrayList<Integer> channelId = new ArrayList<Integer>();
        List<Channel> channelList = categoryAPI.getChannel(access_token, 5, 1).getData();
        for (int i = 0, len = channelList.size(); i < len; i++) {
            Channel channel = channelList.get(i);
            channelId.add(channel.getId());
        }
        return channelId;
    }

    /**
     * 获取所有直播节目单
     * @param access_token
     * @param list  直播电台id集合
     * @return
     */
    public List<LiveProgram> getLiveProgram(String access_token, List<Integer> list) {
        ArrayList<LiveProgram> liveProgramlist = new ArrayList<LiveProgram>();
        int len = list.size();
        int j = 0;
        for (int i = 0; i < 7; i++) {
            for (j = 0; j < len; j++) {


            }
        }
        return liveProgramlist;
    }

    /**
     * 获取更新后的电台节目单
     * @param access_token
     * @param starttime
     * @param endtime
     * @param day_of_week
     * @return
     */
    public List<LiveProgram> getLivegrogram(String access_token,String starttime,String endtime,int day_of_week){
        List<Integer> list=getChannel_update(access_token,starttime,endtime);
        ArrayList<LiveProgram> liveProgramlist = new ArrayList<LiveProgram>();
        for (int i=0,len=list.size();i<len;i++){

        }
        return liveProgramlist;
    }

    /**
     * 获取更新电台的id集合
     * @param access_token
     * @return 电台id的集合
     */
    public List<Integer> getChannel_update(String access_token,String starttime,String endtime){
        ArrayList<Integer> list=new ArrayList<Integer>();
        List<Channel> channelList=updateAPI.getLiveUpdate(access_token,starttime,endtime).getData().getChannels();
        int len=channelList.size();
        for (int i=0;i<len;i++){
            Channel channel=channelList.get(i);
            while (channel.getStatus()==99){
                list.add(channel.getId());
            }
        }
       return list;
    }
}
