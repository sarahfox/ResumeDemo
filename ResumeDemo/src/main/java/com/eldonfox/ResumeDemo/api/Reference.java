package com.eldonfox.ResumeDemo.api;

public class Reference {
	String who;
	String title;
	String email;
	Phone phone;
	ReferenceStatus status;
	
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public ReferenceStatus getStatus() {
		return status;
	}
	public void setStatus(ReferenceStatus status) {
		this.status = status;
	}
}
