package com.fxft.qingtingSDK.bean.Program;


import com.fxft.qingtingSDK.bean.Author_Podcaster;
import com.fxft.qingtingSDK.bean.MediaInfo;

import java.util.List;

public class LiveProgram {
    //        节目id
    private int id;
    //        播放开始时间
    private String start_time;
    //        播放结束时间
    private String end_time;

    //        标题
    private String title;
    //        播放时长，单位秒
    private int duration;
    //        节目类型
    private String type;
    //        群组id
    private String chatgroup_id;
    //        流信息
    private MediaInfo mediainfo;
    //        作者信息
    private List<Author_Podcaster> detail;
    //        所属电台的id
    private int channel_id;
    //        节目唯一标识符
    private String program_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChatgroup_id() {
        return chatgroup_id;
    }

    public void setChatgroup_id(String chatgroup_id) {
        this.chatgroup_id = chatgroup_id;
    }

    public MediaInfo getMediainfo() {
        return mediainfo;
    }

    public void setMediainfo(MediaInfo mediainfo) {
        this.mediainfo = mediainfo;
    }

    public List<Author_Podcaster> getDetail() {
        return detail;
    }

    public void setDetail(List<Author_Podcaster> detail) {
        this.detail = detail;
    }

    public int getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }

    public String getProgram_id() {
        return program_id;
    }

    public void setProgram_id(String program_id) {
        this.program_id = program_id;
    }
}
