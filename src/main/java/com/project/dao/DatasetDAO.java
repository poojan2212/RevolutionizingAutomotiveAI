package com.project.dao;

import java.util.List;

import com.project.model.DatasetVO;

public interface DatasetDAO {
	
	public void insertDataset(DatasetVO datasetVO);
	
	public List searchDataset(DatasetVO datasetVO);

	public void deleteDataset(DatasetVO datasetVO);

	public List editDataset(DatasetVO datasetVO);

	public void updateDataset(DatasetVO datasetVO);


}
