package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback_table")
public class FeedbackVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="feedbackId")
	private int feedbackId;
	
	@Column(name="feedbackSubject")
	private String feedbackSubject;
	
	@Column(name="feedbackDescription")
	private String feedbackDescription;
	
	@Column(name="feedbackFileName")
	private String feedbackFileName;
	
	@Column(name="feedbackFilePath")
	private String feedbackFilePath;
	
	@Column(name="feedbackStatus")
	private boolean feedbackStatus = true;
	
	
	@ManyToOne
	private LoginVO loginVO;

	@Column(name="rating")
	private String rating;
	
	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackSubject() {
		return feedbackSubject;
	}

	public void setFeedbackSubject(String feedbackSubject) {
		this.feedbackSubject = feedbackSubject;
	}

	public String getFeedbackDescription() {
		return feedbackDescription;
	}

	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}

	public String getFeedbackFileName() {
		return feedbackFileName;
	}

	public void setFeedbackFileName(String feedbackFileName) {
		this.feedbackFileName = feedbackFileName;
	}

	public String getFeedbackFilePath() {
		return feedbackFilePath;
	}

	public void setFeedbackFilePath(String feedbackFilePath) {
		this.feedbackFilePath = feedbackFilePath;
	}

	public boolean isFeedbackStatus() {
		return feedbackStatus;
	}

	public void setFeedbackStatus(boolean feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	

}
