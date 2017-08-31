package com.anadadake.crud.test;

import com.anadadake.crud.common.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.anadadake.crud.common.entity.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


public class UserCRUDTest {

    private Session session;
    private Transaction tx;
    private Configuration cf;

    @Before
    public void beforeTest() {
  /*      session = HibernateUtil.getSession();
        tx = session.beginTransaction();*/
        cf = new Configuration().configure();
        SessionFactory sf = cf.buildSessionFactory();
        session = sf.openSession();

    }

    @After
    public void afterTest() {

//        HibernateUtil.closeSession();
        if (session != null && session.isOpen()) {
            session.close();

        }
    }

    /*
     * get方法查询
     */
    @Test
    public void getData() {

        tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(UserEntity.class);
        List list = criteria.list();

//        UserEntity user = (UserEntity) session.get(UserEntity.class, 10);
//        System.out.println(user.getId());
        boolean rtnResult = false;
        if (list != null && list.size() > 0) {
            System.out.println("count number of user is  :" + list.size());
            rtnResult = true;
        }

        tx.commit();
        Assert.assertEquals(true, rtnResult);
    }


    /*
     * 增加
     */

    @Test
    public void addData() {

        tx = session.beginTransaction();

        UserEntity user = new UserEntity();
        user.setMobilePhone("111");
        user.setEmail("111@email.com");
        user.setPassword("password");
        user.setUserNo("000013");
        user.setCreateTime(new Date());
        user.setCreateUser("000001");
        user.setUpdateUser("000001");
        user.setUpdateTime(new Timestamp(System.currentTimeMillis()));


        tx.commit();
/*
      //读取大配置文件 获取连接信息
        Configuration cfg = new Configuration().configure();

        //创建SessionFactory
        SessionFactory fa = cfg.buildSessionFactory();
        //加工Session
        Session se = fa.openSession();
        Transaction tx = se.beginTransaction();
        //保存
        se.save(stu);
        //事务提交
        tx.commit();
        se.close();
        */

        System.out.println("Save ok!");
        Assert.assertEquals(1, 1);


    }

/*    *//*
     * 删除
     *//*
    @Test
    public void delData() {
        tx = session.beginTransaction();
        Session session = HibernateUtil.getSession();
        UserEntity user = new UserEntity();
        user.setUserNo("17");
        Transaction tx = session.beginTransaction();
        session.delete(user);
        tx.commit();
        HibernateUtil.closeSession();
        System.out.println("del ok!");
        tx.commit();
        Assert.assertEquals(1, 1);

    }*/

    /*
     * 修改
     */
/*    @Test
    public void updateData() {
        tx = session.beginTransaction();

        Session session = HibernateUtil.getSession();
        UserEntity user = (UserEntity) session.load(UserEntity.class, 8);
        user.setMobilePhone("8 updated mobile phone");
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        HibernateUtil.closeSession();
        System.out.println("update ok!");
        tx.commit();
        Assert.assertEquals(1, 1);
    }*/
}


