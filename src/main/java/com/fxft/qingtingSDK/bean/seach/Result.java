package com.fxft.qingtingSDK.bean.seach;


import com.fxft.qingtingSDK.bean.BaseResult;

import java.util.List;

public class Result extends BaseResult {
    private List<ResultData> data;

    static class ResultData {
        private String groupVlaue;
        private Doclist doclist;
    }

    static class Doclist {
        private Channel_live channel_live;
        private Channel_ondemand channel_ondemand;
        private Program_live program_live;
        private Program_ondemand program_ondemand;

        public Channel_live getChannel_live() {
            return channel_live;
        }

        public void setChannel_live(Channel_live channel_live) {
            this.channel_live = channel_live;
        }

        public Channel_ondemand getChannel_ondemand() {
            return channel_ondemand;
        }

        public void setChannel_ondemand(Channel_ondemand channel_ondemand) {
            this.channel_ondemand = channel_ondemand;
        }

        public Program_live getProgram_live() {
            return program_live;
        }

        public void setProgram_live(Program_live program_live) {
            this.program_live = program_live;
        }

        public Program_ondemand getProgram_ondemand() {
            return program_ondemand;
        }

        public void setProgram_ondemand(Program_ondemand program_ondemand) {
            this.program_ondemand = program_ondemand;
        }
    }
}
