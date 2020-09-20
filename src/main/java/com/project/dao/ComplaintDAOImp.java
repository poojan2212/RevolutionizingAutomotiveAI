package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.ComplaintVO;

@Repository
public class ComplaintDAOImp implements ComplaintDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void insertComplaint(ComplaintVO complaintVO) {
	
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(complaintVO);
		
	}
	
	@Override
	public List viewComplaint(ComplaintVO complaintVO) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query q = session.createQuery("from ComplaintVO where Status = true ");
		
		List complainList = q.list();
		
		return complainList;
		
		
	}

	@Override
	public List searchComplaint(ComplaintVO complaintVO) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query q = session.createQuery("from ComplaintVO where complaintId = '"+complaintVO.getComplaintId()+"'");
		
		List complaintList = q.list();
		
		return complaintList;
	}
	
     @Override
	  public List seeComplaint(ComplaintVO complaintVO) {
		
    	 Session session = sessionFactory.getCurrentSession();
    	 
    	 Query q = session.createQuery("from ComplaintVO where loginVO_id = '"+complaintVO.getLoginVO().getId()+"'");
    			 
         List complainList = q.list();
         
         return complainList;
    	 
	   }
	


	
	

}
