package com.app.loginandregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.loginandregister.model.Language;

@Repository
public interface LanguageRepo extends JpaRepository<Language, Long> {

}
