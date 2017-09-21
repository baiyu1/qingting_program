package com.fxft.qingtingSDK.bean.seach;

public class Channel_live {
    private int id;
    private String title;
    private String type;
    private int rank;
    private float freqs;
    private String categroy_name;
    private String category_id;
    private String cover;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public float getFreqs() {
        return freqs;
    }

    public void setFreqs(float freqs) {
        this.freqs = freqs;
    }

    public String getCategroy_name() {
        return categroy_name;
    }

    public void setCategroy_name(String categroy_name) {
        this.categroy_name = categroy_name;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String keywords;
    private int score;
}
