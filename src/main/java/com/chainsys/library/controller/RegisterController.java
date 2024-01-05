package com.chainsys.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.library.entity.RegisterForm;
import com.chainsys.library.repositatory.RegisterRepositatory;

@Controller
public class RegisterController {

	@Autowired
	RegisterRepositatory registerRepo;
	
	@RequestMapping("register")
	public String register() {
		return "register.html";
	}
	
	@RequestMapping("addUser")
	public String addUser(RegisterForm registerForm) {
		registerRepo.save(registerForm);
		return "register.html";
	}
}
