package com.fxft.qingtingSDK.bean;

/**
 * 主播 or 作者信息
 */
public class Author_Podcaster {
    private int id;
    private String username;
    private String thumb;
    private String weibo_name;
    private String weibo_id;
    private String qq_name;
    private String qq_id;

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWeibo_name() {
        return weibo_name;
    }

    public void setWeibo_name(String weibo_name) {
        this.weibo_name = weibo_name;
    }

    public String getWeibo_id() {
        return weibo_id;
    }

    public void setWeibo_id(String weibo_id) {
        this.weibo_id = weibo_id;
    }

    public String getQq_name() {
        return qq_name;
    }

    public void setQq_name(String qq_name) {
        this.qq_name = qq_name;
    }

    public String getQq_id() {
        return qq_id;
    }

    public void setQq_id(String qq_id) {
        this.qq_id = qq_id;
    }
}
