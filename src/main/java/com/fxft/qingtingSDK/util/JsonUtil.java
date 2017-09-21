package com.fxft.qingtingSDK.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.http.entity.StringEntity;

public class JsonUtil {
    private StringEntity entity;
    private JsonObject jsonObject;
    private Gson gson=new Gson();
    public  StringEntity toStringentity(JsonObject jsonObject){
        return new StringEntity(gson.toJson(jsonObject),"utf-8");
    }

}
