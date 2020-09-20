package com.project.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.DatasetVO;
import com.project.service.DatasetService;


@Controller
public class DatasetController {
	
	
	@Autowired
	DatasetService datasetService;
	
	@RequestMapping(value="/admin/addDataset.html")
	public ModelAndView addDataset(){
		
		return new ModelAndView("admin/addDataset","data",new DatasetVO());
	}
	
	@RequestMapping(value="/admin/addData.html",method=RequestMethod.POST)
	public ModelAndView addData(@ModelAttribute DatasetVO datasetVO,@RequestParam MultipartFile file,HttpSession session){
		
		String path = session.getServletContext().getRealPath("/");
		String datasetFilePath = path+"document/demo/";

		String datasetFileName = file.getOriginalFilename();
		
		try {
			byte[] b = file.getBytes();
			
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(datasetFilePath+datasetFileName));
			
			bufferedOutputStream.write(b);
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		datasetVO.setDatasetFileName(datasetFileName);
		datasetVO.setDatasetFilePath(datasetFilePath);
		
		datasetService.insertDataset(datasetVO);		
		return new ModelAndView("redirect:/admin/addDataset.html");
	}
	
	@RequestMapping(value="/admin/viewDataset.html",method=RequestMethod.GET)
	public ModelAndView viewData(@ModelAttribute DatasetVO datasetVO){
		
		List list = this.datasetService.searchDataset(datasetVO);
		   return new ModelAndView("admin/viewDataset","list",list);
		
	}
	
	@RequestMapping(value="/admin/deleteDataset.html",method=RequestMethod.GET)
	public ModelAndView Deletedata(@ModelAttribute DatasetVO datasetVO , @RequestParam String id)
	{
		datasetVO.setDatasetId(Integer.parseInt(id));
		List ls=this.datasetService.editDataset(datasetVO);
		
		
		DatasetVO datasetVO2=(DatasetVO)ls.get(0);
		datasetVO2.setStatus(false);
		this.datasetService.updateDataset(datasetVO2);
		return new ModelAndView("redirect:/admin/viewDataset.html");
	}
	
	@RequestMapping(value="/admin/editDataset.html",method=RequestMethod.GET)
	public ModelAndView editData(@ModelAttribute DatasetVO datasetVO,@RequestParam String id) 
	{
		datasetVO.setDatasetId(Integer.parseInt(id));
		List ls=this.datasetService.editDataset(datasetVO);
		
		return new ModelAndView("admin/editDataset","VO",(DatasetVO)ls.get(0));		
	
     }
	
	@RequestMapping(value="updateData.html",method=RequestMethod.POST)
	public ModelAndView updateData(@ModelAttribute DatasetVO datasetVO,@RequestParam String datasetId,String datasetName,String datasetDescription) {
		
		
		this.datasetService.updateDataset(datasetVO);
		return new ModelAndView("redirect:/viewDataset.html");
	
	}
	
	
	
	


}
