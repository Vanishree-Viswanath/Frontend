package com.app.loginandregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.loginandregister.model.Skills;

@Repository
public interface SkillsRepo extends JpaRepository<Skills, Long> {
	
}
