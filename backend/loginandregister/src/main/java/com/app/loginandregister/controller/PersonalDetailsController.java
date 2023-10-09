package com.app.loginandregister.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.loginandregister.model.PersonalDetails;
import com.app.loginandregister.service.PersonalDetailsService;

@RestController
@RequestMapping("/personal-details")
public class PersonalDetailsController {
    private final PersonalDetailsService personalDetailsService;

    @Autowired
    public PersonalDetailsController(PersonalDetailsService personalDetailsService) {
        this.personalDetailsService = personalDetailsService;
    }

    @PostMapping("/save")
    public ResponseEntity<PersonalDetails> createPersonalDetail(@RequestBody PersonalDetails personalDetails) {
        PersonalDetails createdDetails = personalDetailsService.createPersonalDetail(personalDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDetails);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonalDetails> getPersonalDetailById(@PathVariable Long id) {
        PersonalDetails detail = personalDetailsService.getPersonalDetailById(id);
        if (detail != null) {
            return ResponseEntity.ok(detail);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonalDetails> updatePersonalDetail(@PathVariable Long id,
            @RequestBody PersonalDetails updateDetails) {
        PersonalDetails updatedDetail = personalDetailsService.updatePersonalDetail(id, updateDetails);
        if (updatedDetail != null) {
            return ResponseEntity.ok(updatedDetail);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonalDetail(@PathVariable Long id) {
        boolean deleted = personalDetailsService.deletePersonalDetail(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<PersonalDetails>> getAllPersonalDetails() {
        List<PersonalDetails> detailsList = personalDetailsService.getAllPersonalDetails();
        return ResponseEntity.ok(detailsList);
    }
}
