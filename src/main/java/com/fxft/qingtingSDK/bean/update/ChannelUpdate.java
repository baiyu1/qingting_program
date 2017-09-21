package com.fxft.qingtingSDK.bean.update;

import com.fxft.qingtingSDK.bean.channnel.Channel;

import java.util.List;

public class ChannelUpdate {
    private int id;
    private List<Channel> channels;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }
}
