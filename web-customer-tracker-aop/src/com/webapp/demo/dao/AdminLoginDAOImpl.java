package com.webapp.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.demo.entity.AdminLogin;
import com.webapp.demo.entity.Customer;


@Repository("adminLoginDAO")
public class AdminLoginDAOImpl implements AdminLoginDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean verifyDetails(String username,String password) {
		System.out.println("=============>>>>>>>>>>>>>>>>>>>>>>>>>>>>> dao method");
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<AdminLogin> theQuery = currentSession.createQuery("from AdminLogin where userName like:username",AdminLogin.class);
		theQuery.setParameter("username", username);
		List<AdminLogin> users = theQuery.getResultList();
        
        if(users.size()!=0) {
        	return true;
        }
		
		//AdminLogin theLogin = currentSession.get(AdminLogin.class, username);
		
		//System.out.println(theLogin);
		
		return false;
	}
	
}
