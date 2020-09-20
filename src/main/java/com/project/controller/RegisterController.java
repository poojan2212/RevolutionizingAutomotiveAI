package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.LoginVO;
import com.project.model.RegisterVO;
import com.project.service.LoginService;
import com.project.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@Autowired
	LoginService loginService;
	
		
	@RequestMapping(value="/signup.html",method=RequestMethod.GET)
	public ModelAndView loadRegister(){
		
		return new ModelAndView("/company/register","registerVO", new RegisterVO());
	}
	
	@RequestMapping(value="/registerCompany.html",method=RequestMethod.POST)
	public ModelAndView insertCompany(@ModelAttribute RegisterVO registerVO,@ModelAttribute LoginVO loginVO)
	{
		System.out.println("****************");
		loginVO.setUsername(registerVO.getLoginVO().getUsername());
		loginVO.setPassword(registerVO.getLoginVO().getPassword());
		loginVO.setRole("ROLE_COMPANY");
		loginVO.setEnabled("1");
		
		this.loginService.insert(loginVO);
		
		registerVO.setLoginVO(loginVO);
		
		registerService.insertCompany(registerVO);		
		return new ModelAndView("login");
	}
	

}
