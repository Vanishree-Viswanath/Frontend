package com.app.loginandregister.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.loginandregister.model.Country;
import com.app.loginandregister.service.CountryService;


@RestController
@RequestMapping("api/countries")
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@GetMapping
	public List<Country> getAllCountries(){
		return countryService.getAllCountries();
	}
	
	@GetMapping("/{id}")
	public Optional<Country> getCountryById(@PathVariable Long id){
		return countryService.getCountryById(id);
	}
	
	@PostMapping
	public Country createCountry(@RequestBody Country country) {
		return countryService.createCountry(country);
	}
	
	@PostMapping("/{id}")
	public void updateCountry(@PathVariable Long id, @RequestBody Country updatedCountry) {
		countryService.updateCountry(id, updatedCountry);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCountry(@PathVariable Long id) {
		countryService.deleteCountry(id);
	}
}

