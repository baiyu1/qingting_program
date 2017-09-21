package com.fxft.program.serviceimpl;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 程序执行入口
 */
public class Main {
    public static void main(String[] args) {
        final Service service=new Service();
        service.service();
        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                service.uodateService();
            }
        };
        Date date=new Date();
        timer.schedule(timerTask,date,24*60*60*1000);
    }
}
