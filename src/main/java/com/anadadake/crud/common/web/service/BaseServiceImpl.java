package com.anadadake.crud.common.web.service;

import com.anadadake.crud.common.web.service.dao.HibernateDao;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl {

    /**
     * 日志
     */
    protected final Logger log = Logger.getLogger(getClass());

    @Autowired
    protected HibernateDao hibernateDao;

    protected Session getSession() {
        return hibernateDao.getSession();
    }
}
