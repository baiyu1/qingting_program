package com.fxft.qingtingSDK.bean.mediacenterlist;


import com.fxft.qingtingSDK.bean.BaseResult;

public class MediaCenterList extends BaseResult {
    private Radiostations radiostations_download;
    private Radiostations radiostations_hls;
    private Radiostations radiostations_hls_https;
    private Radiostations radiostations_http;

    public Radiostations getRadiostations_download() {
        return radiostations_download;
    }

    public void setRadiostations_download(Radiostations radiostations_download) {
        this.radiostations_download = radiostations_download;
    }

    public Radiostations getRadiostations_hls() {
        return radiostations_hls;
    }

    public void setRadiostations_hls(Radiostations radiostations_hls) {
        this.radiostations_hls = radiostations_hls;
    }

    public Radiostations getRadiostations_hls_https() {
        return radiostations_hls_https;
    }

    public void setRadiostations_hls_https(Radiostations radiostations_hls_https) {
        this.radiostations_hls_https = radiostations_hls_https;
    }

    public Radiostations getRadiostations_http() {
        return radiostations_http;
    }

    public void setRadiostations_http(Radiostations radiostations_http) {
        this.radiostations_http = radiostations_http;
    }
}
