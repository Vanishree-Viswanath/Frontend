package com.app.loginandregister.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String countryName;
	private String name;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public State(Long id, String countryName, String name, String description) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.name = name;
		this.description = description;
	}

	public State() {

	}

	@Override
	public String toString() {
		return "State [id=" + id + ", countryName=" + countryName + ", name=" + name + ", description=" + description
				+ "]";
	}

}
