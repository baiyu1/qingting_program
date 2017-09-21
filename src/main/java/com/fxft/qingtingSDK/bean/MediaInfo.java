package com.fxft.qingtingSDK.bean;

/**
 * 流媒体的信息结构
 */
public class MediaInfo {
    private int id;
    private double duration;
    private Bitrates_url bitrates_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Bitrates_url getBitrates_url() {
        return bitrates_url;
    }

    public void setBitrates_url(Bitrates_url bitrates_url) {
        this.bitrates_url = bitrates_url;
    }

    static class Bitrates_url {
        private int bitrate;
        private String file_path;

        public int getBitrate() {
            return bitrate;
        }

        public void setBitrate(int bitrate) {
            this.bitrate = bitrate;
        }

        public String getFile_path() {
            return file_path;
        }

        public void setFile_path(String file_path) {
            this.file_path = file_path;
        }
    }
}
