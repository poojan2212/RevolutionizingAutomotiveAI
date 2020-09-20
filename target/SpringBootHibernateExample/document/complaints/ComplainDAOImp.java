package com.project.dao;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.ComplainVO;

@Repository
public class ComplainDAOImp implements ComplainDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void insertComplain(ComplainVO complainVO) {
	
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(complainVO);
		
	}
	
	@Override
	public List viewComplain(ComplainVO complainVO) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query q = session.createQuery("from ComplainVO where complainStatus = true ");
		
		List complainList = q.list();
		
		return complainList;
		
		
	}

	@Override
	public List searchComplain(ComplainVO complainVO) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query q = session.createQuery("from ComplainVO where complainId = '"+complainVO.getComplainId()+"'");
		
		List complainList = q.list();
		
		return complainList;
	}
	
     @Override
	  public List seeComplain(ComplainVO complainVO) {
		
    	 Session session = sessionFactory.getCurrentSession();
    	 
    	 Query q = session.createQuery("from ComplainVO where loginVO_id = '"+complainVO.getLoginVO().getId()+"'");
    			 
         List complainList = q.list();
         
         return complainList;
    	 
	   }
	
	
}
