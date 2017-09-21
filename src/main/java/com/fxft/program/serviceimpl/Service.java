package com.fxft.program.serviceimpl;

import com.fxft.program.Util.TimeUtil;
import com.fxft.program.service.HibernateService;
import com.fxft.program.service.ProgramService;
import com.fxft.program.service.TokenService;
import com.fxft.qingtingSDK.bean.Program.LiveProgram;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private ProgramService service=new ProgramService();
    private TimeUtil timeUtil=new TimeUtil();

    /**
     * 存取所有的节目单
     */
    public void service(){
        String token= new TokenService().getToken();
//        所有电台
        ArrayList<Integer> list=service.getChannel_id(token);
        List<LiveProgram> programList=service.getLiveProgram(token,list);
        new HibernateService().save(programList);
    }

    /**
     * 更新节目单
     */
    public void uodateService(){
        String token=new TokenService().getToken();
        List<Integer> list=service.getChannel_update(token,timeUtil.startTime(),timeUtil.endTime());
        List<LiveProgram> programList=service.getLiveProgram(token,list);
        new HibernateService().save(programList);
    }
}
