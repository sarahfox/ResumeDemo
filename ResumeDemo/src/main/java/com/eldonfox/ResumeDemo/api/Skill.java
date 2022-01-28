package com.eldonfox.ResumeDemo.api;

public class Skill {
	String category;
	String name;
	Proficiency proficiency;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Proficiency getProficiency() {
		return proficiency;
	}
	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}
}
