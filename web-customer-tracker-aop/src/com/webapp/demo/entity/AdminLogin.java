package com.webapp.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "admin_details")
public class AdminLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="username")
	@NotBlank(message="Username cannot be empty")
	private String userName;
	
	@NotBlank(message="please enter password")
	@Column(name="login_password")
	private String password;

	public String getUserName() {
		return userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "AdminLogin [userName=" + userName + ", password=" + password + "]";
	}
		
	
}
