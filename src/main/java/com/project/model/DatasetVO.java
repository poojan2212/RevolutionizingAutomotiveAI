package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dataset_tb")

public class DatasetVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="datasetId")
	private int datasetId;
	
	@Column(name="datasetFileName")
	private String datasetFileName;
	
	@Column(name="datasetFilePath")
	private String datasetFilePath;
	
	@Column(name="Description")
	private String datasetDescription;
	
	@Column(name="status")
	private boolean status=true;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getDatasetId() {
		return datasetId;
	}

	public void setDatasetId(int datasetId) {
		this.datasetId = datasetId;
	}

	

	public String getDatasetFileName() {
		return datasetFileName;
	}

	public void setDatasetFileName(String datasetFileName) {
		this.datasetFileName = datasetFileName;
	}

	public String getDatasetFilePath() {
		return datasetFilePath;
	}

	public void setDatasetFilePath(String datasetFilePath) {
		this.datasetFilePath = datasetFilePath;
	}

	public String getDatasetDescription() {
		return datasetDescription;
	}

	public void setDatasetDescription(String datasetDescription) {
		this.datasetDescription = datasetDescription;
	}
	
	

}
