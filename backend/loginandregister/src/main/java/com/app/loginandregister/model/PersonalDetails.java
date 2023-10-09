package com.app.loginandregister.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PersonalDetails {
    @Id
    private Long id;
    private String firstname;
    private String middlename;
    private String lastname;
    private LocalDate dateofbirth;
    private int age;
    private String gender;
    private String email;
    private String mobilenum;
    private String address;
    private String country;
    private String state;
    private String city;
    private String pincode;
    private String alternatenum;
    private String emergencynum;
    private String bloodgroup;
    private String passportavailable;
    private String passportnum;
    private String aadharnum;
    private String drivinglicense;
    private String previousempid;
    private String previousempdetails;
    private String worklocation;
    private String maritalstatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAlternatenum() {
        return alternatenum;
    }

    public void setAlternatenum(String alternatenum) {
        this.alternatenum = alternatenum;
    }

    public String getEmergencynum() {
        return emergencynum;
    }

    public void setEmergencynum(String emergencynum) {
        this.emergencynum = emergencynum;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getPassportavailable() {
        return passportavailable;
    }

    public void setPassportavailable(String passportavailable) {
        this.passportavailable = passportavailable;
    }

    public String getPassportnum() {
        return passportnum;
    }

    public void setPassportnum(String passportnum) {
        this.passportnum = passportnum;
    }

    public String getAadharnum() {
        return aadharnum;
    }

    public void setAadharnum(String aadharnum) {
        this.aadharnum = aadharnum;
    }

    public String getDrivinglicense() {
        return drivinglicense;
    }

    public void setDrivinglicense(String drivinglicense) {
        this.drivinglicense = drivinglicense;
    }

    public String getPreviousempid() {
        return previousempid;
    }

    public void setPreviousempid(String previousempid) {
        this.previousempid = previousempid;
    }

    public String getPreviousempdetails() {
        return previousempdetails;
    }

    public void setPreviousempdetails(String previousempdetails) {
        this.previousempdetails = previousempdetails;
    }

    public String getWorklocation() {
        return worklocation;
    }

    public void setWorklocation(String worklocation) {
        this.worklocation = worklocation;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public PersonalDetails(Long id, String firstname, String middlename, String lastname, LocalDate dateofbirth,
            int age, String gender, String email, String mobilenum, String address, String country, String state,
            String city, String pincode, String alternatenum, String emergencynum, String bloodgroup,
            String passportavailable, String passportnum, String aadharnum, String drivinglicense, String previousempid,
            String previousempdetails, String worklocation, String maritalstatus) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.mobilenum = mobilenum;
        this.address = address;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.alternatenum = alternatenum;
        this.emergencynum = emergencynum;
        this.bloodgroup = bloodgroup;
        this.passportavailable = passportavailable;
        this.passportnum = passportnum;
        this.aadharnum = aadharnum;
        this.drivinglicense = drivinglicense;
        this.previousempid = previousempid;
        this.previousempdetails = previousempdetails;
        this.worklocation = worklocation;
        this.maritalstatus = maritalstatus;
    }

    public PersonalDetails() {
    }

    @Override
    public String toString() {
        return "PersonalDetails [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
                + lastname + ", dateofbirth=" + dateofbirth + ", age=" + age + ", gender=" + gender + ", email=" + email
                + ", mobilenum=" + mobilenum + ", address=" + address + ", country=" + country + ", state=" + state
                + ", city=" + city + ", pincode=" + pincode + ", alternatenum=" + alternatenum + ", emergencynum="
                + emergencynum + ", bloodgroup=" + bloodgroup + ", passportavailable=" + passportavailable
                + ", passportnum=" + passportnum + ", aadharnum=" + aadharnum + ", drivinglicense=" + drivinglicense
                + ", previousempid=" + previousempid + ", previousempdetails=" + previousempdetails + ", worklocation="
                + worklocation + ", maritalstatus=" + maritalstatus + "]";
    }

}
