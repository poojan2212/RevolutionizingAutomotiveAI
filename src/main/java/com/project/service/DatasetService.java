package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.DatasetDAO;
import com.project.model.DatasetVO;

@Service
public class DatasetService {

	@Autowired
	DatasetDAO datasetDAO;
	
	@Transactional
	public void insertDataset(DatasetVO datasetVO)
	{
		datasetDAO.insertDataset(datasetVO);
	}
	
	@Transactional
	public List searchDataset(DatasetVO datasetVO)
	{
		List ls = datasetDAO.searchDataset(datasetVO);
		return ls;
	}

	@Transactional
	public void deleteDataset(DatasetVO datasetVO)
	{
		datasetDAO.deleteDataset(datasetVO);
	}

	@Transactional
	public List editDataset(DatasetVO datasetVO) {
		
	List ls =datasetDAO.editDataset(datasetVO);
	return ls;
	}
	
	@Transactional
	public void updateDataset(DatasetVO datasetVO) {
		
		datasetDAO.updateDataset(datasetVO);
		
		
	}
	
}
