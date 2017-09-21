package com.fxft.program.service;

import com.fxft.QingTingConfig;
import com.fxft.program.Util.RedisUtil;
import com.fxft.qingtingSDK.api.TokenAPI;
import com.fxft.qingtingSDK.bean.token.Token;
import redis.clients.jedis.Jedis;

public class TokenService {
    private static TokenAPI tokenAPI=new TokenAPI();
    private static Jedis jedis= RedisUtil.getJedis();

    /**
     * 缓存token
     */
    public void setToken(){
        Token token=tokenAPI.getToken(QingTingConfig.client_id,QingTingConfig.client_secret);
        jedis.set("qingting_token",token.getAccess_token());
        jedis.expire("qingting_token",token.getExpires_in());

    }

    /**
     * 获取token
     * @return
     */
    public String getToken(){
        String token=new String();
        if (jedis.exists("qingting_token")){
             token=jedis.get("qingting_token");
        }else {
            setToken();
            token=jedis.get("qingting_token");
        }
        return token;
    }
}
