package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoginVO;

@Repository
public class LoginDAOImp implements LoginDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insert(LoginVO loginVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(loginVO);
		
	}
	
	@Override
	public void delete(LoginVO loginVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(loginVO);
		
	}
	
	@Override
	public List searchByUserName(String username)
	{
		Session session = this.sessionFactory.getCurrentSession();
		Query q=session.createQuery("from LoginVO where username='"+username+"' ");	
		List loginlist=q.list();
		return loginlist;
			
	}
	
	@Override
	public List searchstep1(LoginVO loginVO) 
	{
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from LoginVO where username = '"+loginVO.getUsername()+"' ");
		List ls = q.list();
		return ls;
	}
	
	
	@Override
	public void updatePassword(LoginVO loginVO) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Query q=session.createQuery("UPDATE LoginVO set password='"+loginVO.getPassword() +"'where username='"+loginVO.getUsername() +"'");
		q.executeUpdate();
		transaction.commit();
	}
	
}
