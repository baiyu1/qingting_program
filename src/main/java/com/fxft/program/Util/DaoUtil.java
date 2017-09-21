package com.fxft.program.Util;

import com.fxft.program.dao.FxftProlistCopy;
import com.fxft.qingtingSDK.api.LiveAPI;
import com.fxft.qingtingSDK.bean.Author_Podcaster;
import com.fxft.qingtingSDK.bean.Program.LiveProgram;
import com.fxft.qingtingSDK.bean.channnel.Channel;

import java.util.List;

public class DaoUtil {
    /**
     * 将获取下来的节目单转化为FxftProlistCopy字段
     *
     * @param liveProgram
     * @return
     */
    public FxftProlistCopy Turn(LiveProgram liveProgram) {
        FxftProlistCopy copy = new FxftProlistCopy();
        copy.setId(liveProgram.getId());
        copy.setProgramname(liveProgram.getTitle());
        List<Author_Podcaster> authorList = liveProgram.getDetail();
        String name = new String();
        for (int i = 0, len = authorList.size(); i < len; i++) {
            copy.setHost(authorList.get(0).getUsername());
            while (i > 0) {
                name = authorList.get(i).getUsername();
            }
        }
        copy.setComment(liveProgram.getType());
        copy.setRphost(name);
        int channel_id = liveProgram.getChannel_id();
        Channel channel = new LiveAPI().getLive("access_token", channel_id).getData().get(0);
        copy.setChannelName(channel.getTitle());
        copy.setChannelId(String.valueOf(channel_id));
//    解析时间
        TimeUtil util=new TimeUtil();
        copy.setIntime(util.turnTime(liveProgram.getStart_time()));
        copy.setOuttime(util.turnTime(liveProgram.getEnd_time()));
        copy.setCreattime(util.getTime());
        return copy;
    }
}
