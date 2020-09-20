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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="feedbackId")
	private int feedbackId;
	
	
	@Column(name="feedbackDescription")
	private String feedbackDescription;
	
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="feedbackStatus")
	private boolean feedbackStatus = true;
	
		
	@ManyToOne
	private LoginVO loginVO;


	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackDescription() {
		return feedbackDescription;
	}

	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}

	
	public boolean isFeedbackStatus() {
		return feedbackStatus;
	}

	public void setFeedbackStatus(boolean feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	

}
