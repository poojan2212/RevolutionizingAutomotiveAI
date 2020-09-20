package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.DatasetVO;

@Repository
public class DatasetDAOImp implements DatasetDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertDataset(DatasetVO datasetVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.save(datasetVO);
	}
	
	@Override
	public List searchDataset(DatasetVO datasetVO) {
		
		List ls = new ArrayList();
		
			Session session=sessionFactory.getCurrentSession();
			Query q=  session.createQuery("from DatasetVO where status=true");
			ls = q.list();
			return ls;
	}
	
	@Override
	public void deleteDataset(DatasetVO datasetVO)
			{
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(datasetVO);

			}
	
	@Override
	public List editDataset(DatasetVO datasetVO)
	{

		List ls = new ArrayList();
		
			Session session=sessionFactory.getCurrentSession();
			Query q= session.createQuery("from DatasetVO where datasetId='"+datasetVO.getDatasetId()+"'");
			ls = q.list();
			return ls;
			
	}
	
	@Override
	public void updateDataset(DatasetVO datasetVO)
	{
		Session session = sessionFactory.getCurrentSession();
		session.update(datasetVO);
		
		
		
	}


}
