package com.fxft.program.Util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
    //    服务器地址
    private static String ADDR="localhost";
    //    端口号
    private static int PORT=3306;
    //    密码 如果没有则不用填；
    private static String PassWord="";
    //    可连接的实例数目，默认为8
    private static int MAX_TOTAL=512;
    //    控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值也是8。
    private static int MAX_IDLE = 50;
    //    等待可用连接最大时间，单位毫秒，默认-1，表示永不超时；
    private static int MAX_WAIT=10000;

    private static  int TIMEOUT=10000;
    //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
    private static boolean TEST_ON_BORROW = true;

    private static JedisPool jedisPool=null;

    //    初始化
    static{
        try {
            JedisPoolConfig config =new JedisPoolConfig();
            config.setMaxTotal(MAX_TOTAL);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWaitMillis(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool=new JedisPool(config,ADDR,PORT,TIMEOUT,PassWord);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 获取jedis实例
     * @return
     */
    public  static Jedis getJedis(){
        try {
            if (jedisPool!=null){
                Jedis jedis=jedisPool.getResource();
                return jedis;
            }else {
                return  null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 释放jedis资源
     */
    public static void returnResource(final Jedis jedis){
        if (jedis!=null){
            jedis.close();
        }
    }

}
