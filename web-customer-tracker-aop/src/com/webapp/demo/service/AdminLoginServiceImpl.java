package com.webapp.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.dao.AdminLoginDAO;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminLoginDAO theAdminLoginDAO;


	
	@Override
	@Transactional
	public boolean verifyDetailsOfUser(String userName, String password) {
		System.out.println("=============>>>>>>>>>>>>>>>>>>>>>>>>>>>>> service method");
		
		if(theAdminLoginDAO.verifyDetails(userName,password)) {
			return true;
		}
			
		return false;
		
	}
	
	
	
}
