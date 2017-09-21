package com.fxft.qingtingSDK.bean.category.Recommend;


import com.fxft.qingtingSDK.bean.BaseResult;
import com.fxft.qingtingSDK.bean.MediaInfo;
import com.fxft.qingtingSDK.bean.Parent_info;
import com.fxft.qingtingSDK.bean.Thumbs;

public class Recommend extends BaseResult {
    private RecommendData data;

    public RecommendData getData() {
        return data;
    }

    public void setData(RecommendData data) {
        this.data = data;
    }

    static class RecommendData {
        private String brief_name;
        private String name;
        private Recommends recommends;

        public String getBrief_name() {
            return brief_name;
        }

        public void setBrief_name(String brief_name) {
            this.brief_name = brief_name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Recommends getRecommends() {
            return recommends;
        }

        public void setRecommends(Recommends recommends) {
            this.recommends = recommends;
        }
    }

    static class Recommends {
        private Detail detail;
        private String title;
        private String sub_title;
        private int id;
        private int object_id;
        private Parent_info parent_info;
        private String thumb;
        private Thumbs thumbs;
        private String update_time;

        public Detail getDetail() {
            return detail;
        }

        public void setDetail(Detail detail) {
            this.detail = detail;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getObject_id() {
            return object_id;
        }

        public void setObject_id(int object_id) {
            this.object_id = object_id;
        }

        public Parent_info getParent_info() {
            return parent_info;
        }

        public void setParent_info(Parent_info parent_info) {
            this.parent_info = parent_info;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public Thumbs getThumbs() {
            return thumbs;
        }

        public void setThumbs(Thumbs thumbs) {
            this.thumbs = thumbs;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }
    }

    static class Detail {
        private int chatgroup_id;
        private String desciption;
        private String[] detail;
        private int duration;
        private int id;
        private MediaInfo mediaInfo;
        private double original_fee;
        private double price;
        private String redirect_url;
        private String sale_status;
        private int sequence;
        private Thumbs thumbs;
        private String title;
        private String type;
        private String update_time;

        public int getChatgroup_id() {
            return chatgroup_id;
        }

        public void setChatgroup_id(int chatgroup_id) {
            this.chatgroup_id = chatgroup_id;
        }

        public String getDesciption() {
            return desciption;
        }

        public void setDesciption(String desciption) {
            this.desciption = desciption;
        }

        public String[] getDetail() {
            return detail;
        }

        public void setDetail(String[] detail) {
            this.detail = detail;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public MediaInfo getMediaInfo() {
            return mediaInfo;
        }

        public void setMediaInfo(MediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
        }

        public double getOriginal_fee() {
            return original_fee;
        }

        public void setOriginal_fee(double original_fee) {
            this.original_fee = original_fee;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getRedirect_url() {
            return redirect_url;
        }

        public void setRedirect_url(String redirect_url) {
            this.redirect_url = redirect_url;
        }

        public String getSale_status() {
            return sale_status;
        }

        public void setSale_status(String sale_status) {
            this.sale_status = sale_status;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public Thumbs getThumbs() {
            return thumbs;
        }

        public void setThumbs(Thumbs thumbs) {
            this.thumbs = thumbs;
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

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }
    }
}
