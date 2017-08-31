package com.anadadake.crud.basic;

import com.anadadake.crud.common.entity.UserEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * Hibernate 测试类
 */
public class HibernateSessionTest {
//    private static final Logger logger = Logger.getLogger(HibernateSessionTest.class.getName());


    public static void main(final String[] args) throws Exception {

//        logger.setLevel(Level.ALL);
        //配置器初始化
        Configuration configuration = new Configuration().configure();

       /* Configuration configuration = new Configuration();
        configuration.configure("/hibernate.cfg.xml");*/

        //Session工厂创建
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //获取session
        Session session = sessionFactory.openSession();

        try {
            //开启事务
            session.beginTransaction();



            //TODO start
            UserEntity user = new UserEntity();
            user.setMobilePhone("111");
            user.setEmail("111@email.com");
            user.setPassword("password");
            user.setUserNo("000013");
            user.setCreateTime(new Date());
            user.setCreateUser("000001");
            user.setUpdateUser("000001");
            user.setUpdateTime(new Timestamp(System.currentTimeMillis()));

            //TODO end
            session.save(user);


            //HQL的查询方式
            Query query = session.createQuery("select u from UserEntity u");
            List list = query.list();

            if (list !=null && list.size()>0){
                for (Object aList : list) {

                    UserEntity userEntity = (UserEntity) aList;
                    System.out.println(userEntity.getUserNo());

                }
            }


            Criteria criteria = session.createCriteria(UserEntity.class);

//            criteria.add(Restrictions.eq("callRecordId", callRecord.getCallRecordId()));
//            criteria.add(Restrictions.eq("resvFileTypeCode", OrderAttachmentType.CALL_CONFIRMATION.getCode()));
            criteria.add(Restrictions.eq("userNo","000001"));
            List list1= criteria.list();
            System.out.println("---");
            for (Object aList1 : list1) {

                UserEntity userEntity = (UserEntity) aList1;
                System.out.println(userEntity.getUserNo());
                if (userEntity.getUserInfo() != null) {
                    System.out.println("@@@@@@@");
                    System.out.println(userEntity.getUserInfo().getUserNameCn());
                }

            }



            //提交事务
            session.getTransaction().commit();

        } catch (Exception e) {
            Transaction transaction = session.getTransaction();
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            System.exit(0);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
                System.exit(0);
            }
        }

    }



}

