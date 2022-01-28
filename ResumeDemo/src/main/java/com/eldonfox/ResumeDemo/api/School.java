package com.eldonfox.ResumeDemo.api;

import java.util.List;

public class School {
	String schoolName;
	String address;
	List<String> degrees;
	List<String> majors;
	List<String> minors;
	List<String> awards;
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getDegrees() {
		return degrees;
	}
	public void setDegrees(List<String> degrees) {
		this.degrees = degrees;
	}
	public List<String> getMajors() {
		return majors;
	}
	public void setMajors(List<String> majors) {
		this.majors = majors;
	}
	public List<String> getMinors() {
		return minors;
	}
	public void setMinors(List<String> minors) {
		this.minors = minors;
	}
	public List<String> getAwards() {
		return awards;
	}
	public void setAwards(List<String> awards) {
		this.awards = awards;
	}
}
