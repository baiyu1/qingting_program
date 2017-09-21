package com.fxft.program.Util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
    /**
     * 获取当前的日期
     * @return
     */
    public String getDay(){
        SimpleDateFormat df=new SimpleDateFormat("yyyy:MM:dd");
        String day=df.format(new Date());
        return day;
    }
    public int day_of_week(){
        Date date=new Date();
        int[] weekDays={7,1,2,3,4,5,6};
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        int w=calendar.get(Calendar.DAY_OF_WEEK)-1;
        if (w<0)w=0;
        return weekDays[w];
    }

    /**
     * 开始时间
     * @return
     */
    public String startTime(){
        Date date=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        date=calendar.getTime();
        String day=df.format(date);
        String start=day+2300;
        return start;
    }

    /**
     * 结束时间
     * @return
     */
    public String endTime(){
        SimpleDateFormat df=new SimpleDateFormat("yyyy:MM:dd");
        String day=df.format(new Date());
        String end=day+2300;
        return end;
    }

    /**
     * 获取当前时间
     * @return
     */
    public Timestamp getTime(){
        Timestamp timestamp=new Timestamp(new Date().getTime());
        return timestamp;
    }

    /**
     * 转换时间的格式
     * @param str
     * @return
     */
    public Timestamp turnTime(String str){
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String string=sf.format(str);
        Timestamp timestamp=Timestamp.valueOf(string);
        return timestamp;
    }

}
