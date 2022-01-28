package com.w3foxes.sarah.ResumeDemo.api;

public class Phone {
	PhoneType type;
	String number;
	
	public Phone(PhoneType type, String number) {
		this.type = type;
		this.number = number;
	}
	public PhoneType getType() {
		return type;
	}
	public void setType(PhoneType type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
