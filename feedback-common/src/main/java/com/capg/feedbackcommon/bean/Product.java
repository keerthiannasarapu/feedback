package com.capg.feedbackcommon.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedProduct")
public class Product {
	
	@Id
	
	private int pid;
	private String pname;
	private String model;
	private String category;
	private String feedback;
	private double price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", model=" + model + ", category=" + category
				+ ", feedback=" + feedback + ", price=" + price + "]";
	}
	public Product(int pid, String pname, String model, String category, String feedback, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.model = model;
		this.category = category;
		this.feedback = feedback;
		this.price = price;
	}
	
	public Product() {
		
	}

}
