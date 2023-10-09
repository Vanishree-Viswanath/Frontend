package com.app.loginandregister.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skills {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String softSkill;
	private String softSkillProficiency;
	private String technicalSkill;
	private String technicalSkillProficiency;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSoftSkill() {
		return softSkill;
	}
	public void setSoftSkill(String softSkill) {
		this.softSkill = softSkill;
	}
	public String getSoftSkillProficiency() {
		return softSkillProficiency;
	}
	public void setSoftSkillProficiency(String softSkillProficiency) {
		this.softSkillProficiency = softSkillProficiency;
	}
	public String getTechnicalSkill() {
		return technicalSkill;
	}
	public void setTechnicalSkill(String technicalSkill) {
		this.technicalSkill = technicalSkill;
	}
	public String getTechnicalSkillProficiency() {
		return technicalSkillProficiency;
	}
	public void setTechnicalSkillProficiency(String technicalSkillProficiency) {
		this.technicalSkillProficiency = technicalSkillProficiency;
	}
	public Skills(Long id, String softSkill, String softSkillProficiency, String technicalSkill,
			String technicalSkillProficiency) {
		super();
		this.id = id;
		this.softSkill = softSkill;
		this.softSkillProficiency = softSkillProficiency;
		this.technicalSkill = technicalSkill;
		this.technicalSkillProficiency = technicalSkillProficiency;
	}
	public Skills() {
		
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", softSkill=" + softSkill + ", softSkillProficiency=" + softSkillProficiency
				+ ", technicalSkill=" + technicalSkill + ", technicalSkillProficiency=" + technicalSkillProficiency
				+ "]";
	}
	
	
	
	
}
