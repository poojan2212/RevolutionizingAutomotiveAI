package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Package_tb")

public class PackageVO {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="packageId")
	private int packageId;
	
	@Column(name="Name")
	private String packageName;
	
	@Column(name="Survey")
	private String packageSurvey;
	
	@Column(name="Description")
	private String packageDescription;

	@Column(name="Amount")
	private String packagePrice;


	@Column(name="status")
	private boolean status=true;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageSurvey() {
		return packageSurvey;
	}

	public void setPackageSurvey(String packageSurvey) {
		this.packageSurvey = packageSurvey;
	}

	public String getPackageDescription() {
		return packageDescription;
	}

	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	public String getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(String packagePrice) {
		this.packagePrice = packagePrice;
	}
	
	


}
