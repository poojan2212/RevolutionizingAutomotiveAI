package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.RegisterVO;


@Repository
public class CompanyDAOImp implements CompanyDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
		
	@Override
	public List viewCompany(RegisterVO registerVO) {
		
		List ls = new ArrayList();
		
			Session session=sessionFactory.getCurrentSession();
			Query q=  session.createQuery("from RegisterVO");
			ls = q.list();
			return ls;
	}
	

}
