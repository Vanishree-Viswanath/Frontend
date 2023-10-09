package com.app.loginandregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.loginandregister.model.Skills;
import com.app.loginandregister.repository.SkillsRepo;

@RestController
@RequestMapping("/skills")
public class SkillsController {

	@Autowired
	private SkillsRepo skillRepo;

	public ResponseEntity<String> saveSkills(@RequestBody Skills skills) {
		try {
			skillRepo.save(skills);
			return ResponseEntity.ok("Skill saved successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error saving skill: " + e.getMessage());
		}
	}
}
