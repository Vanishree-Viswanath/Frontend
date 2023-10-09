package com.app.loginandregister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.loginandregister.model.PersonalDetails;
import com.app.loginandregister.repository.PersonalDetailsRepo;

@Service
public class PersonalDetailsService {

    private PersonalDetailsRepo personalDetailsRepo;

    @Autowired
    public PersonalDetailsService(PersonalDetailsRepo personalDetailsRepo) {
        this.personalDetailsRepo = personalDetailsRepo;
    }

    public PersonalDetails createPersonalDetail(PersonalDetails personalDetails) {
        return personalDetailsRepo.save(personalDetails);
    }

    public PersonalDetails getPersonalDetailById(Long id) {
        return personalDetailsRepo.findById(id).orElse(null);
    }

    public PersonalDetails updatePersonalDetail(Long id, PersonalDetails updateDetails) {
        PersonalDetails existingDetails = personalDetailsRepo.findById(id).orElse(null);

        if (existingDetails != null) {

            existingDetails.setFirstname(updateDetails.getFirstname());
            existingDetails.setMiddlename(updateDetails.getMiddlename());
            existingDetails.setLastname(updateDetails.getLastname());
            existingDetails.setDateofbirth(updateDetails.getDateofbirth());
            existingDetails.setAge(updateDetails.getAge());
            existingDetails.setGender(updateDetails.getGender());
            existingDetails.setEmail(updateDetails.getEmail());
            existingDetails.setMobilenum(updateDetails.getMobilenum());
            existingDetails.setAddress(updateDetails.getAddress());
            existingDetails.setCountry(updateDetails.getCountry());
            existingDetails.setState(updateDetails.getState());
            existingDetails.setCity(updateDetails.getCity());
            existingDetails.setPincode(updateDetails.getPincode());
            existingDetails.setAlternatenum(updateDetails.getAlternatenum());
            existingDetails.setEmergencynum(updateDetails.getEmergencynum());
            existingDetails.setBloodgroup(updateDetails.getBloodgroup());
            existingDetails.setPassportavailable(updateDetails.getPassportavailable());
            existingDetails.setPassportnum(updateDetails.getPassportnum());
            existingDetails.setAadharnum(updateDetails.getAadharnum());
            existingDetails.setDrivinglicense(updateDetails.getDrivinglicense());
            existingDetails.setPreviousempid(updateDetails.getPreviousempid());
            existingDetails.setPreviousempdetails(updateDetails.getPreviousempdetails());
            existingDetails.setWorklocation(updateDetails.getWorklocation());
            existingDetails.setMaritalstatus(updateDetails.getMaritalstatus());

            return personalDetailsRepo.save(existingDetails);
        } else {
            return null;
        }
    }

    public boolean deletePersonalDetail(Long id) {
        PersonalDetails existingDetails = personalDetailsRepo.findById(id).orElse(null);

        if (existingDetails != null) {
            personalDetailsRepo.delete(existingDetails);
            return true;
        }

        return false;
    }

    public List<PersonalDetails> getAllPersonalDetails() {
        return personalDetailsRepo.findAll();
    }
}
