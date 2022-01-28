package com.eldonfox.ResumeDemo.api;

import java.util.List;

public class Resume {
	ContactInfo contactInfo;
	List<School> education;
	List<Skill> skills;
	List<Job> jobs;
	List<Recomendation> recommendations;
	List<Reference> references;
	
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public List<School> getEducation() {
		return education;
	}
	public void setEducation(List<School> education) {
		this.education = education;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public List<Job> getJobs() {
		return jobs;
	}
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	public List<Recomendation> getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(List<Recomendation> recommendations) {
		this.recommendations = recommendations;
	}
	public List<Reference> getReferences() {
		return references;
	}
	public void setReferences(List<Reference> references) {
		this.references = references;
	}
}
