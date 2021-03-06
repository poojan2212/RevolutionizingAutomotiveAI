package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.FeedbackVO;

@Repository
public class FeedbackDAOImp implements FeedbackDAO{
	
	@Autowired
	 SessionFactory sessionFactory;
		
		@Override
		public void insertFeedback(FeedbackVO feedbackVO) {
			
			Session session = sessionFactory.getCurrentSession();
			 
			session.saveOrUpdate(feedbackVO);
			
			
		}
		
	     	@Override
			public List viewFeedback(FeedbackVO feedbackVO){
				
			Session session = sessionFactory.getCurrentSession();
			
			Query q = session.createQuery("from FeedbackVO where feedbackStatus = true");
			
			List feedbackList = q.list();
			
			return feedbackList;
			
			}


}
