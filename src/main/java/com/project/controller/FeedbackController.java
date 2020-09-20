package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.FeedbackVO;
import com.project.model.LoginVO;
import com.project.service.FeedbackService;
import com.project.service.LoginService;
import com.project.util.BaseMethods;

@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@Autowired
	LoginService loginService;
	
	
	
	@RequestMapping(value="company/loadFeedback.html",method=RequestMethod.GET)
	public ModelAndView loadFeedback(@ModelAttribute FeedbackVO feedbackVO)
	{
		return new ModelAndView("company/postFeedback","feedbackVO",new FeedbackVO());
	}
   
	@RequestMapping(value="company/insertFeedback.html",method=RequestMethod.POST)
	public ModelAndView insertFeedback(@ModelAttribute FeedbackVO feedbackVO, HttpServletRequest request) {
		
		
			try {
			
	    	String userName = BaseMethods.searchUser();
	    	
	    	System.out.println(userName);
	    	
			List loginList = this.loginService.searchByUserName(userName);
			
			LoginVO loginVO2 = (LoginVO) loginList.get(0);
			
			System.out.println(loginVO2.getId());
			
			feedbackVO.setLoginVO(loginVO2);
		
			
	
	
			feedbackVO.setFeedbackStatus(true);
	       	

			
		
			this.feedbackService.insertFeedback(feedbackVO);
		

		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/company/loadFeedback.html");
		
	} 
	
	@RequestMapping(value="admin/viewFeedback.html",method=RequestMethod.GET)
	public ModelAndView viewFeedback(@ModelAttribute FeedbackVO feedbackVO) {
		
		List feedbackList = this.feedbackService.viewFeedback(feedbackVO);
		
		return new ModelAndView("admin/viewFeedback","feedbackList",feedbackList);
	}
	
	@RequestMapping(value="/company/viewFeedback.html",method=RequestMethod.GET)
	public ModelAndView seeFeedback(@ModelAttribute FeedbackVO feedbackVO) {
		
		
		List feedbackList = this.feedbackService.viewFeedback(feedbackVO);
		
		return new ModelAndView("/company/viewFeedback","feedbackList",feedbackList);
	}
	

}
