package com.app.loginandregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.loginandregister.model.EducationDetails;
import com.app.loginandregister.repository.EducationDetailsRepo;

@Service
public class EducationDetailsService {
    @Autowired
    private EducationDetailsRepo educationDetailsRepo;

    public EducationDetails saveEducationDetails(EducationDetails educationDetails) {
        return educationDetailsRepo.save(educationDetails);
    }
}
