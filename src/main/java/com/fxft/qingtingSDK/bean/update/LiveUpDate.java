package com.fxft.qingtingSDK.bean.update;

import com.fxft.qingtingSDK.bean.BaseResult;

/**
 * 更新
 */
public class LiveUpDate extends BaseResult {
    private ChannelUpdate data;

    public ChannelUpdate getData() {
        return data;
    }

    public void setData(ChannelUpdate data) {
        this.data = data;
    }
}
