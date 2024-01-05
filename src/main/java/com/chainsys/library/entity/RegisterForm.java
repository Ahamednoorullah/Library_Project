package com.chainsys.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RegisterForm {

	@Id
	private String userName;
	private String email;
	private String password;
	private String cnfpassword;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCnfpassword() {
		return cnfpassword;
	}
	public void setCnfpassword(String cnfpassword) {
		this.cnfpassword = cnfpassword;
	}
	
}
