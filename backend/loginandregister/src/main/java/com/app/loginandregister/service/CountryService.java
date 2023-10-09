package com.app.loginandregister.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.loginandregister.model.Country;
import com.app.loginandregister.repository.CountryRepo;


@Service
public class CountryService {
	
	@Autowired
	private CountryRepo countryRepo;
	
	public List<Country> getAllCountries(){
		return countryRepo.findAll();	
	}
	
	public Optional<Country> getCountryById(Long id){
		return countryRepo.findById(id);
	}
	
	public Country createCountry (Country country) {
		return countryRepo.save(country);
	}
	
	public void updateCountry(Long id, Country updatedCountry) {
		if(countryRepo.existsById(id)) {
			updatedCountry.setId(id);
			countryRepo.save(updatedCountry);
		}
	}
	
	public void deleteCountry(Long id) {
		countryRepo.deleteById(id);
	}
}
