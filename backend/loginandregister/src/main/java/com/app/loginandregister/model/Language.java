package com.app.loginandregister.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Language {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String language1;
	private String language2;
	private String language3;
	private boolean canRead;
	private boolean canWrite;
	private boolean canSpeak;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLanguage1() {
		return language1;
	}
	public void setLanguage1(String language1) {
		this.language1 = language1;
	}
	public String getLanguage2() {
		return language2;
	}
	public void setLanguage2(String language2) {
		this.language2 = language2;
	}
	public String getLanguage3() {
		return language3;
	}
	public void setLanguage3(String language3) {
		this.language3 = language3;
	}
	public boolean isCanRead() {
		return canRead;
	}
	public void setCanRead(boolean canRead) {
		this.canRead = canRead;
	}
	public boolean isCanWrite() {
		return canWrite;
	}
	public void setCanWrite(boolean canWrite) {
		this.canWrite = canWrite;
	}
	public boolean isCanSpeak() {
		return canSpeak;
	}
	public void setCanSpeak(boolean canSpeak) {
		this.canSpeak = canSpeak;
	}
	public Language(Long id, String language1, String language2, String language3, boolean canRead, boolean canWrite,
			boolean canSpeak) {
		super();
		this.id = id;
		this.language1 = language1;
		this.language2 = language2;
		this.language3 = language3;
		this.canRead = canRead;
		this.canWrite = canWrite;
		this.canSpeak = canSpeak;
	}
	public Language() {
		
	}
	
	@Override
	public String toString() {
		return "Language [id=" + id + ", language1=" + language1 + ", language2=" + language2 + ", language3="
				+ language3 + ", canRead=" + canRead + ", canWrite=" + canWrite + ", canSpeak=" + canSpeak + "]";
	}
	
	
	
	
}
