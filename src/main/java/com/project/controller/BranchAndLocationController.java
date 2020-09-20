package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.BranchVO;
import com.project.model.LocationVO;
import com.project.service.BranchService;
import com.project.service.LocationService;

@Controller
public class BranchAndLocationController {
	
	@Autowired LocationService locationService;
	@Autowired BranchService branchService;
	
	
	@RequestMapping(value="company/viewBranchAndLocation.html",method=RequestMethod.GET)
	public ModelAndView loadBranchAndLocation(@ModelAttribute LocationVO locationVO){
		
		List locationList=this.locationService.viewLocation();
		System.out.println("LocationList========"+locationList.size());
		
		List branchList=this.branchService.viewBranch();
		System.out.println("BranchList========"+branchList.size());
		
		return new ModelAndView("/company/viewBranchAndLocation","branchVO",new BranchVO()).addObject("locationList", locationList).addObject("branchList", branchList);
		
	}
	
	@RequestMapping(value="company/loadBranchByLocation",method=RequestMethod.GET)
	public ModelAndView loadBranchByLocation(@ModelAttribute LocationVO locationVO,BranchVO branchVO,@RequestParam ("locationId")int locationId)
	{
		
		locationVO.setLocationID(locationId);
		branchVO.setLocationVO(locationVO);
		
		List branchList = this.branchService.dropdownBranchByLocation(branchVO);
		
		System.out.println("BranchList============="+branchList.size());
		return new ModelAndView("/company/JsonBranch","branchList",branchList);
		
	}

}
