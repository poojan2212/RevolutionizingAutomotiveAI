package com.project.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ComplaintVO;
import com.project.model.LoginVO;
import com.project.service.ComplaintServcie;
import com.project.service.LoginService;
import com.project.util.BaseMethods;

@Controller
public class ComplaintController {
	
	@Autowired
	ComplaintServcie complaintServcie; 
	
	@Autowired
	LoginService loginService; 
	
	@RequestMapping(value="company/loadComplaint.html",method=RequestMethod.GET)
	public ModelAndView loadComplaint(@ModelAttribute ComplaintVO complaintVO) {
		
		return new ModelAndView("company/postComplaints","complaintVO",new ComplaintVO()); 
		
	}
		
	@RequestMapping(value="/company/insertComplaint.html",method=RequestMethod.POST)
	public ModelAndView insertComplaint(@RequestParam MultipartFile complaintFile,HttpServletRequest request,@ModelAttribute ComplaintVO complaintVO) {
		
		String filePath = request.getSession().getServletContext().getRealPath("/");
		
		String file = complaintFile.getOriginalFilename();
		
		File f = new File(file);
		
		String complaintFileName = f.getName();
		String complaintFilePath = filePath + "document\\complaints\\"; 
		
				
		try {
			byte b[]=complaintFile.getBytes();  
			
	        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(complaintFilePath+"/"+complaintFileName));  
	        
	        bufferedOutputStream.write(b);  
	        bufferedOutputStream.flush();  
	        bufferedOutputStream.close();
		
			}
			catch(Exception e){
				
				e.printStackTrace();
			}
		
	    	String userName = BaseMethods.searchUser();
	    	
	    	System.out.println(userName+"userName==================================================");
	    	
	    	List loginList = this.loginService.searchByUserName(userName);
			
			LoginVO loginVO2 = (LoginVO) loginList.get(0);
			
			System.out.println(loginVO2.getId());
			
			complaintVO.setLoginVO(loginVO2);
			complaintVO.setComplaintFileName(complaintFileName);
			complaintVO.setComplaintFilePath(complaintFilePath);
			
			SimpleDateFormat formatter = new  SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			
			complaintVO.setComplaintDate(formatter.format(date));
			complaintVO.setComplaintStatus("pending");
			complaintVO.setStatus(true);
			complaintVO.setReply("NO REPLY");
			
			this.complaintServcie.insertComplaint(complaintVO);
				
	    return new ModelAndView("redirect:/company/loadComplaint.html");
	
	}

	
	@RequestMapping(value="/admin/viewComplaint.html",method=RequestMethod.GET)
	public ModelAndView viewComplaint(@ModelAttribute ComplaintVO complaintVO) {
		
		List complaintList = this.complaintServcie.viewComplaint(complaintVO);
		System.out.println(complaintList.size()+"=========================================================================");
		
		return new ModelAndView("admin/viewComplaints","complaintList",complaintList);
		
	}
	
	@RequestMapping(value="admin/replytoUser.html",method=RequestMethod.GET)
	public ModelAndView loadReply(@RequestParam("complaintId") int complaintId,@ModelAttribute ComplaintVO complaintVO) {
		
		
		complaintVO.setComplaintId(complaintId);
		
		List complaintList = this.complaintServcie.searchComplaint(complaintVO);
		
		return new ModelAndView("admin/ReplyComplaint","complaintVO",complaintList.get(0));
		
	}
	
	
	@RequestMapping(value="admin/insertReply.html",method=RequestMethod.POST)
	public ModelAndView insertReply(@ModelAttribute ComplaintVO complaintVO) {
		
		
		complaintVO.setComplaintStatus("replied");
		
		SimpleDateFormat formatter = new  SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		complaintVO.setReplyDate(formatter.format(date));
		
		this.complaintServcie.insertComplaint(complaintVO);
		
		return new ModelAndView("redirect:/admin/viewComplaint.html");
	}
	
	
	@RequestMapping(value="company/seeComplaint.html",method=RequestMethod.GET)
	public ModelAndView seeComplaint(@ModelAttribute ComplaintVO complaintVO) {
		
		
		String username = BaseMethods.searchUser();
    	
    	System.out.println(username);
    	
		List loginList = this.loginService.searchByUserName(username);
		
		LoginVO loginVO2 = (LoginVO) loginList.get(0);
		
		complaintVO.setLoginVO(loginVO2);
		
		List complaintList = this.complaintServcie.seeComplaint(complaintVO);
		
		return new ModelAndView("company/viewComplaints","complaintList",complaintList);
		
	}

	
}
