package com.app.loginandregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.loginandregister.model.PersonalDetails;

@Repository
public interface PersonalDetailsRepo extends JpaRepository<PersonalDetails, Long> {

}
