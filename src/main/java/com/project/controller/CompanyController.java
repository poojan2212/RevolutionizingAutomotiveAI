package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.RegisterVO;
import com.project.service.CompanyService;

@Controller
public class CompanyController {
	

	@Autowired
	CompanyService companyService;

	@RequestMapping(value="/admin/viewCompany.html",method=RequestMethod.GET)
	public ModelAndView viewCompany(@ModelAttribute RegisterVO registerVO){
		
		List list = this.companyService.searchCompany(registerVO);
		   return new ModelAndView("admin/viewCompany","list",list);
		
	}
	

}
