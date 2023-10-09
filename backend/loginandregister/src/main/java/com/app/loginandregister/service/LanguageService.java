package com.app.loginandregister.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.loginandregister.model.Language;
import com.app.loginandregister.repository.LanguageRepo;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepo languageRepo;
	
	public List<Language> getAllLanguages(){
		return languageRepo.findAll();
	}
	
	public Optional<Language> getLanguageById(Long id){
		return languageRepo.findById(id);
	}
	
	public Language saveLanguage(Language language) {
		return languageRepo.save(language);
	}
	
	public void deleteLanguage(Long id) {
	  languageRepo.deleteById(id);
	}
}
