package com.app.loginandregister.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.loginandregister.model.Language;
import com.app.loginandregister.service.LanguageService;

@RestController
@RequestMapping("language")
public class LanguageController {

	private LanguageService languageService;
	
	@GetMapping("/")
	public ResponseEntity<List<Language>> getAllLanguages(){
		List<Language> language = languageService.getAllLanguages();
		return new ResponseEntity<> (language, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Language> getLanguageById(@PathVariable Long id){
		Optional<Language> language = languageService.getLanguageById(id);
		return language.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/")
	public ResponseEntity<Language> saveLanguage(@RequestBody Language language){
		Language savedLanguage = languageService.saveLanguage(language);
		return new ResponseEntity<>(savedLanguage, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLanguage(@PathVariable Long id) {
        languageService.deleteLanguage(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
		
}
