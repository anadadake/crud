package com.anadadake.crud.common.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//工具类HibernateUtil

public class HibernateUtil {

    private static Configuration cf = new Configuration();
    private static SessionFactory sf = cf.buildSessionFactory();


    public static Session getSession() {
        return sf.openSession();
    }

    public static void closeSession() {
        getSession().close();
    }
}
