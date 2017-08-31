package com.anadadake.crud.common.web.service.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDao {

	@Autowired
	protected SessionFactory sessionFactory;

	/**
	 * 获取当前Session
	 * 
	 * @return 当前的会话
	 */
	public Session getSession() {
//		return sessionFactory.getCurrentSession();
		return sessionFactory.openSession();
	}

}
