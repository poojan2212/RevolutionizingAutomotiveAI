package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.DatasetVO;
import com.project.model.PackageVO;
import com.project.service.PackageService;

@Controller
public class PackageController {

	@Autowired
	PackageService packageService;
	
	@RequestMapping(value="/admin/addPackage.html")
	public ModelAndView addPackage(){
		
		return new ModelAndView("admin/addPackage","data",new PackageVO());
	}
	
	@RequestMapping(value="/admin//addPack.html",method=RequestMethod.POST)
	public ModelAndView addPackage(@ModelAttribute PackageVO packageVO){
		
		packageService.insertPackage(packageVO);		
		return new ModelAndView("redirect:/admin/addPackage.html");
	}
	
	@RequestMapping(value="/admin/viewPackage.html",method=RequestMethod.GET)
	public ModelAndView viewPackage(@ModelAttribute PackageVO packageVO){
		
		List list = this.packageService.searchPackage(packageVO);
		   return new ModelAndView("admin/viewPackage","list",list);
		
	}
	
	@RequestMapping(value="/admin/deletePackage.html",method=RequestMethod.GET)
	public ModelAndView DeletePackage(@ModelAttribute PackageVO packageVO , @RequestParam String id)
	{
		packageVO.setPackageId(Integer.parseInt(id));
		List ls=this.packageService.editPackage(packageVO);
		PackageVO packageVO2=(PackageVO)ls.get(0);
		packageVO2.setStatus(false);
		this.packageService.updatePackage(packageVO2);
		
		return new ModelAndView("redirect:/admin/viewPackage.html");
	}
	
	@RequestMapping(value="/admin/editPackage.html",method=RequestMethod.GET)
	public ModelAndView editPackage(@ModelAttribute PackageVO packageVO,@RequestParam String id) 
	{
		packageVO.setPackageId(Integer.parseInt(id));
		List ls=this.packageService.editPackage(packageVO);
		
		return new ModelAndView("admin/editPackage","VO",(PackageVO)ls.get(0));		
	
     }
	
	@RequestMapping(value="/admin/updatePackage.html",method=RequestMethod.POST)
	public ModelAndView updatePackage(@ModelAttribute PackageVO packageVO,@RequestParam String packageId,String packageName,String packageDescription,String packageSurvey,String packagePrice) {
		
		
		this.packageService.updatePackage(packageVO);
		return new ModelAndView("redirect:/admin/viewPackage.html");
	
	}
	
}
