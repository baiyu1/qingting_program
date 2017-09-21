package com.fxft.program.service;

import com.fxft.program.Util.DaoUtil;
import com.fxft.program.Util.HibernateUtil;
import com.fxft.qingtingSDK.bean.Program.LiveProgram;
import org.hibernate.Session;

import java.util.List;

/**
 * 持久层
 */
public class HibernateService {
    private static Session session= HibernateUtil.getSession();
    public void save(List<LiveProgram> list){
        int len=list.size();
        for (int i=0;i<len;i++){
            LiveProgram liveProgram=list.get(i);
            session.save(new DaoUtil().Turn(liveProgram));
        }
    }
}
