package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.ComplaintDAO;
import com.project.model.ComplaintVO;

@Service
public class ComplaintServcie {

	@Autowired
	ComplaintDAO complaintDAO;

	@Transactional
	public void insertComplaint(ComplaintVO complaintVO)
	{
		this.complaintDAO.insertComplaint(complaintVO);
	}
	
	@Transactional
	public List viewComplaint(ComplaintVO complaintVO) {
		
		List complaintList = this.complaintDAO.viewComplaint(complaintVO);
		
		return complaintList;
	}
	
	@Transactional
	public List searchComplaint(ComplaintVO complaintVO) {
		
		List complaintList = this.complaintDAO.searchComplaint(complaintVO);
		
		return complaintList;
		
	}
	
    @Transactional
    public List seeComplaint(ComplaintVO complaintVO) {
    	
            List complaintList =	this.complaintDAO.seeComplaint(complaintVO);
         
            return complaintList;
    
    }
	

}
