package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.RegisterVO;



@Repository
public class RegisterDAOImp implements RegisterDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertCompany(RegisterVO registerVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(registerVO);
	}
	

}
