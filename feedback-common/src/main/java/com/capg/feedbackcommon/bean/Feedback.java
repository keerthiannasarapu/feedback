package com.capg.feedbackcommon.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
@Entity
@Table(name="Feedback")
public class Feedback {
	
	@Id
	
	
	private int pid;
	private String feedback;
	private String response;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "Feedback [pid=" + pid + ", feedback=" + feedback + ", response=" + response + "]";
	}
	public Feedback(int pid, String feedback, String response) {
		super();
		this.pid = pid;
		this.feedback = feedback;
		this.response = response;
	}
	
public Feedback() {
	
}
}
