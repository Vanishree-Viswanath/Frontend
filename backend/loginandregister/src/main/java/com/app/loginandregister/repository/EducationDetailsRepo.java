package com.app.loginandregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.loginandregister.model.EducationDetails;

@Repository
public interface EducationDetailsRepo extends JpaRepository<EducationDetails, Long> {

}
