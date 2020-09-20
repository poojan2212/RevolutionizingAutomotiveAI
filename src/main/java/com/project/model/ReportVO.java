package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="report_table")

public class ReportVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reportId")
	private int reportId;
	
	@Column(name="surveyLocation")
	private String surveyLocation;
	
	@Column(name="surveyBranch")
	private String surveyBranch;
	
	@Column(name="surveyDate")
	private String surveyDate;
	
	@Column(name="FileName")
	private String fileName;
	
	@Column(name="FilePath")
	private String filePath;
	
	@Column(name="status")
	private boolean status = true;

}
