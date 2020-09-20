package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.LoginVO;
import com.project.model.RegisterVO;
import com.project.service.LoginService;
import com.project.util.BaseMethods;

@Controller
public class MainController extends BaseMethods{

	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(value="/")
	public ModelAndView load(){
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/admin/index", method=RequestMethod.GET)
	public ModelAndView adminIndex(){
		
		return new ModelAndView("/admin/index");
	}
	
	@RequestMapping(value="/company/viewDetection", method=RequestMethod.GET)
	public ModelAndView viewDetection(){
		
		return new ModelAndView("/company/viewDetection");
	}
	
	@RequestMapping(value="/company/index", method=RequestMethod.GET)
	public ModelAndView companyIndex(){
		
		return new ModelAndView("/company/index");
	}
	
	@RequestMapping(value="/logout",method={RequestMethod.GET, RequestMethod.POST })
	public String viewUserDetails(ModelMap model,HttpServletResponse response, HttpServletRequest request)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		
		if(auth!=null)
		{
			new SecurityContextLogoutHandler().logout(request, response, auth);
			request.getSession().invalidate();
			request.getSession().setAttribute("tempstatus", "success");
			request.getSession().setAttribute("statusText", "logout successfully");
		}
		
		return "login";
	}

	
	@RequestMapping(value="/login", method={RequestMethod.GET, RequestMethod.POST })
	public ModelAndView load403(){
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="step1", method= RequestMethod.GET)
	public ModelAndView step1(@ModelAttribute LoginVO loginVO)
	{
		return new ModelAndView("emailOTP");
	}
	
	@RequestMapping(value="searchstep1",method = RequestMethod.POST)
	public ModelAndView searchstep1(@RequestParam("username") String un,LoginVO loginVO,HttpSession session)
	{
		System.out.println("USERNAME>>>"+un);
		session.setAttribute("username", un);
		loginVO.setUsername(un);

		List ls=this.loginService.searchstep1(loginVO);
		System.out.println("List size>>>>>>>>>"+ls.size());
		if(ls!=null && !ls.isEmpty())
		{
			int OTP=generateOTP(4);
			System.out.println("OTP>>>>>"+OTP);
			String subject="otp";
			String content="otp:"+OTP;
			sendMail(un,subject, content);
			session.setAttribute("generatedOTP",OTP);
			return new ModelAndView("newPassword");
		}
		else
		{
			return new ModelAndView("redirect:/");	
		}   
	}
	@RequestMapping(value="step2", method = RequestMethod.POST)
	public ModelAndView step2(@RequestParam("password") String pwd ,LoginVO loginVO,RegisterVO registerVO,HttpSession session)
	{
		String userName= (String)session.getAttribute("username");
		loginVO.setUsername(userName);
		loginVO.setPassword(pwd);
		
		this.loginService.updatePassword(loginVO);
		return new ModelAndView("redirect:/");
	}
	
	
}
