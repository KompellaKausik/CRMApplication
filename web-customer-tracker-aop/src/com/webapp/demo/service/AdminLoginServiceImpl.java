package com.webapp.demo.service;

import javax.transaction.Transactional;

import com.webapp.demo.dao.AdminLoginDAO;

public class AdminLoginServiceImpl implements AdminLoginService {

	private AdminLoginDAO theAdminLoginDAO;

	@Override
	@Transactional
	public boolean verifyDetails(String username,String password) {
		// TODO Auto-generated method stub
		
		System.out.println("=============>>>>>>>>>>>>>>>>>>>>>>>>>>>>> service method");
		
		if(theAdminLoginDAO.verifyDetails(username,password)) {
			return true;
		}
			
		return false;
	}
	
	
	
}
