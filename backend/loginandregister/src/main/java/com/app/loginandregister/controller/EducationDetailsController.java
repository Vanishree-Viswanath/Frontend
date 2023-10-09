package com.app.loginandregister.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.loginandregister.model.EducationDetails;
import com.app.loginandregister.repository.EducationDetailsRepo;

@RestController
@RequestMapping("/api/education")
public class EducationDetailsController {
    private final EducationDetailsRepo educationDetailsRepo;

    @Autowired
    public EducationDetailsController(EducationDetailsRepo educationDetailsRepo) {
        this.educationDetailsRepo = educationDetailsRepo;
    }

    @PostMapping
    public void saveEducationDetails(@RequestBody EducationDetails educationDetails) {
        educationDetailsRepo.save(educationDetails);
    }

    @GetMapping
    public List<EducationDetails> getAllEducationDetails() {
        return educationDetailsRepo.findAll();
    }
}
