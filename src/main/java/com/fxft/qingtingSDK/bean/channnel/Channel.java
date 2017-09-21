package com.fxft.qingtingSDK.bean.channnel;


import com.fxft.qingtingSDK.bean.Author_Podcaster;
import com.fxft.qingtingSDK.bean.MediaInfo;
import com.fxft.qingtingSDK.bean.Thumbs;

import java.util.List;

/**
 * 点播电台
 */
public class Channel {
    //    分类id
    private int category_id;
    //    专辑id 或者 电台id
    private int id;
    //    简介
    private String description;
    //    标题
    private String title;
    //    更新时间
    private String updata_time;
    //    播放次数
    private String playcount;
    //    流信息
    private MediaInfo mediaInfo;
    //    缩略图
    private Thumbs thumbs;
    //    类型 channel_ondemand表示专辑；channel_live表示电台
    private String type;
    //    分享地址
    private String weburl;
    //    最后一个节目
    private String last_program;
    //    好评指数
    private int star;
    //    电台呼号
    private String freq;
    //    收听数量
    private int audience_count;
    //    节目数量
    private int program_count;
    //    免费节目
    private String sale_props;
    //    付费类型  0免费，1已购买，2未购买
    private int sale_type;
    //    电台状态
    private int status;
    //    主播信息
    private List<Author_Podcaster> detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdata_time() {
        return updata_time;
    }

    public void setUpdata_time(String updata_time) {
        this.updata_time = updata_time;
    }

    public String getPlaycount() {
        return playcount;
    }

    public void setPlaycount(String playcount) {
        this.playcount = playcount;
    }

    public Thumbs getThumbs() {
        return thumbs;
    }

    public void setThumbs(Thumbs thumbs) {
        this.thumbs = thumbs;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    public String getLast_program() {
        return last_program;
    }

    public void setLast_program(String last_program) {
        this.last_program = last_program;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getProgram_count() {
        return program_count;
    }

    public void setProgram_count(int program_count) {
        this.program_count = program_count;
    }

    public String getSale_props() {
        return sale_props;
    }

    public void setSale_props(String sale_props) {
        this.sale_props = sale_props;
    }

    public int getSale_type() {
        return sale_type;
    }

    public void setSale_type(int sale_type) {
        this.sale_type = sale_type;
    }

    public List<Author_Podcaster> getDetail() {
        return detail;
    }

    public void setDetail(List<Author_Podcaster> detail) {
        this.detail = detail;
    }

    public MediaInfo getMediaInfo() {
        return mediaInfo;
    }

    public void setMediaInfo(MediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public int getAudience_count() {
        return audience_count;
    }

    public void setAudience_count(int audience_count) {
        this.audience_count = audience_count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
