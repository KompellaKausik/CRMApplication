package com.webapp.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.demo.entity.AdminLogin;


@Repository
public class AdminLoginDAOImpl implements AdminLoginDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean verifyDetails(String username,String password) {
		System.out.println("=============>>>>>>>>>>>>>>>>>>>>>>>>>>>>> dao method");
		Session currentSession = sessionFactory.getCurrentSession();
		AdminLogin theLogin = currentSession.get(AdminLogin.class, username);
		
		System.out.println(theLogin);
		
		return false;
	}
	
}
