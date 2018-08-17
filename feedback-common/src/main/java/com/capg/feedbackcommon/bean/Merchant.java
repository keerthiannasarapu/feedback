package com.capg.feedbackcommon.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Merchant")
public class Merchant {
	
	@Id
	
	private int mid;
	private int pid;
	public Merchant(int mid, int pid, String musername, String mpassword, String merchantType, String response,
			String feedback) {
		super();
		this.mid = mid;
		this.pid = pid;
		this.musername = musername;
		this.mpassword = mpassword;
		this.merchantType = merchantType;
		this.response = response;
		this.feedback = feedback;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	private String musername;
	private String mpassword;
	private String merchantType;
	private String response;
	private String feedback;
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Merchant(int mid, String musername, String mpassword, String merchantType, String response,
			String feedback) {
		super();
		this.mid = mid;
		this.musername = musername;
		this.mpassword = mpassword;
		this.merchantType = merchantType;
		this.response = response;
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Merchant [mid=" + mid + ", pid=" + pid + ", musername=" + musername + ", mpassword=" + mpassword
				+ ", merchantType=" + merchantType + ", response=" + response + ", feedback=" + feedback + "]";
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMusername() {
		return musername;
	}
	public void setMusername(String musername) {
		this.musername = musername;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public Merchant(int mid, String musername, String mpassword, String merchantType, String response) {
		super();
		this.mid = mid;
		this.musername = musername;
		this.mpassword = mpassword;
		this.merchantType = merchantType;
		this.response = response;
	}
	public Merchant() {
		
	}
	

}
