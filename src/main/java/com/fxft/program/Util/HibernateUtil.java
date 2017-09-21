package com.fxft.program.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
        Configuration cfg=new Configuration().configure();
        StandardServiceRegistryBuilder builder=
                new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
        StandardServiceRegistryImpl registry=(StandardServiceRegistryImpl) builder.build();
        sessionFactory=cfg.buildSessionFactory(registry);
    }

    /**
     * 获取会话
     * @return
     */
    public static Session getSession(){
        return  sessionFactory.openSession();
    }

    /**
     * 关闭会话
     * @param session
     */
    public static void closeSession(Session session){
        if (session!=null){
            if(session.isOpen()){
                session.close();
            }
        }
    }
}
