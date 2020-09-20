package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="complaint_tb")
public class ComplaintVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="complaintId")
	private int complaintId;
	
	@Column(name="complaintSubject")
	private String complaintSubject;
	
	@Column(name="complaintDescription")
	private String complaintDescription;
	
	@Column(name="complaintDate")
	private String complaintDate;
	
	@Column(name="complaintFileName")
	private String complaintFileName;
	
	@Column(name="complaintFilePath")
	private String complaintFilePath;
	
	@Column(name="complaintStatus")
	private String complaintStatus = "pending";

	@Column(name="status")
	private boolean status = true;
	
	@Column(name="reply")
	private String reply;

	@Column(name="replyDate")
	private String replyDate;

	@ManyToOne
	private LoginVO loginVO;

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaintSubject() {
		return complaintSubject;
	}

	public void setComplaintSubject(String complaintSubject) {
		this.complaintSubject = complaintSubject;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public String getComplaintDate() {
		return complaintDate;
	}

	public void setComplaintDate(String complaintDate) {
		this.complaintDate = complaintDate;
	}

	public String getComplaintFileName() {
		return complaintFileName;
	}

	public void setComplaintFileName(String complaintFileName) {
		this.complaintFileName = complaintFileName;
	}

	public String getComplaintFilePath() {
		return complaintFilePath;
	}

	public void setComplaintFilePath(String complainFilePath) {
		this.complaintFilePath = complainFilePath;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}
	
	
	
}
