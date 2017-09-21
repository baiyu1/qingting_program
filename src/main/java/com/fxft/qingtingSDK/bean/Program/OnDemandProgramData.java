package com.fxft.qingtingSDK.bean.Program;


import com.fxft.qingtingSDK.bean.Author_Podcaster;
import com.fxft.qingtingSDK.bean.BaseResult;
import com.fxft.qingtingSDK.bean.MediaInfo;
import com.fxft.qingtingSDK.bean.Thumbs;

import java.util.List;

/**
 * 点播节目
 */
public class OnDemandProgramData extends BaseResult {
    private OnDemandProgram data;

    public OnDemandProgram getData() {
        return data;
    }

    public void setData(OnDemandProgram data) {
        this.data = data;
    }



    static class OnDemandProgram {
        private int id;
        private String title;
        private Thumbs thumbs;
        private String description;
        private String updata_time;
        private float duration;
        private String type;
        private String chatgroup_id;
        private MediaInfo mediainfo;
        private int sequence;
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

        public Thumbs getThumbs() {
            return thumbs;
        }

        public void setThumbs(Thumbs thumbs) {
            this.thumbs = thumbs;
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

        public float getDuration() {
            return duration;
        }

        public void setDuration(float duration) {
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

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public List<Author_Podcaster> getDetail() {
            return detail;
        }

        public void setDetail(List<Author_Podcaster> detail) {
            this.detail = detail;
        }
    }

}
