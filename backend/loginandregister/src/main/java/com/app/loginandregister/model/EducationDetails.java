package com.app.loginandregister.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EducationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String gDegreeName;
    private String gUniversityName;
    private String gCollegeName;
    private String gPassingYear;
    private String gBacklogs;
    private String gBacklogsCleared;
    private String graduationCgpa;
    private String educationGap;
    private String educationGapDuration;
    private String pgDegree;
    private String pgDegreeName;
    private String pgUniversityName;
    private String pgCollegeName;
    private String pgPassingYear;
    private String pgBacklogs;
    private String pgBacklogsCleared;
    private String pgCgpa;
    private String pgEducationgap;
    private String pgEducationgapDuration;
    private String twelthStandard;
    private String twelthStandardSchoolName;
    private String twelthStandardBoardName;
    private String twelthStandardPassingYear;
    private String twelthStndardCgpa;
    private String tenthStandard;
    private String tenthStandardSchoolName;
    private String tenthStandardBoardName;
    private String tenthStandardPassingYear;
    private String tenthStandardCgpa;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getgDegreeName() {
        return gDegreeName;
    }

    public void setgDegreeName(String gDegreeName) {
        this.gDegreeName = gDegreeName;
    }

    public String getgUniversityName() {
        return gUniversityName;
    }

    public void setgUniversityName(String gUniversityName) {
        this.gUniversityName = gUniversityName;
    }

    public String getgCollegeName() {
        return gCollegeName;
    }

    public void setgCollegeName(String gCollegeName) {
        this.gCollegeName = gCollegeName;
    }

    public String getgPassingYear() {
        return gPassingYear;
    }

    public void setgPassingYear(String gPassingYear) {
        this.gPassingYear = gPassingYear;
    }

    public String getgBacklogs() {
        return gBacklogs;
    }

    public void setgBacklogs(String gBacklogs) {
        this.gBacklogs = gBacklogs;
    }

    public String getgBacklogsCleared() {
        return gBacklogsCleared;
    }

    public void setgBacklogsCleared(String gBacklogsCleared) {
        this.gBacklogsCleared = gBacklogsCleared;
    }

    public String getGraduationCgpa() {
        return graduationCgpa;
    }

    public void setGraduationCgpa(String graduationCgpa) {
        this.graduationCgpa = graduationCgpa;
    }

    public String getEducationGap() {
        return educationGap;
    }

    public void setEducationGap(String educationGap) {
        this.educationGap = educationGap;
    }

    public String getEducationGapDuration() {
        return educationGapDuration;
    }

    public void setEducationGapDuration(String educationGapDuration) {
        this.educationGapDuration = educationGapDuration;
    }

    public String getPgDegree() {
        return pgDegree;
    }

    public void setPgDegree(String pgDegree) {
        this.pgDegree = pgDegree;
    }

    public String getPgDegreeName() {
        return pgDegreeName;
    }

    public void setPgDegreeName(String pgDegreeName) {
        this.pgDegreeName = pgDegreeName;
    }

    public String getPgUniversityName() {
        return pgUniversityName;
    }

    public void setPgUniversityName(String pgUniversityName) {
        this.pgUniversityName = pgUniversityName;
    }

    public String getPgCollegeName() {
        return pgCollegeName;
    }

    public void setPgCollegeName(String pgCollegeName) {
        this.pgCollegeName = pgCollegeName;
    }

    public String getPgPassingYear() {
        return pgPassingYear;
    }

    public void setPgPassingYear(String pgPassingYear) {
        this.pgPassingYear = pgPassingYear;
    }

    public String getPgBacklogs() {
        return pgBacklogs;
    }

    public void setPgBacklogs(String pgBacklogs) {
        this.pgBacklogs = pgBacklogs;
    }

    public String getPgBacklogsCleared() {
        return pgBacklogsCleared;
    }

    public void setPgBacklogsCleared(String pgBacklogsCleared) {
        this.pgBacklogsCleared = pgBacklogsCleared;
    }

    public String getPgCgpa() {
        return pgCgpa;
    }

    public void setPgCgpa(String pgCgpa) {
        this.pgCgpa = pgCgpa;
    }

    public String getPgEducationgap() {
        return pgEducationgap;
    }

    public void setPgEducationgap(String pgEducationgap) {
        this.pgEducationgap = pgEducationgap;
    }

    public String getPgEducationgapDuration() {
        return pgEducationgapDuration;
    }

    public void setPgEducationgapDuration(String pgEducationgapDuration) {
        this.pgEducationgapDuration = pgEducationgapDuration;
    }

    public String getTwelthStandard() {
        return twelthStandard;
    }

    public void setTwelthStandard(String twelthStandard) {
        this.twelthStandard = twelthStandard;
    }

    public String getTwelthStandardSchoolName() {
        return twelthStandardSchoolName;
    }

    public void setTwelthStandardSchoolName(String twelthStandardSchoolName) {
        this.twelthStandardSchoolName = twelthStandardSchoolName;
    }

    public String getTwelthStandardBoardName() {
        return twelthStandardBoardName;
    }

    public void setTwelthStandardBoardName(String twelthStandardBoardName) {
        this.twelthStandardBoardName = twelthStandardBoardName;
    }

    public String getTwelthStandardPassingYear() {
        return twelthStandardPassingYear;
    }

    public void setTwelthStandardPassingYear(String twelthStandardPassingYear) {
        this.twelthStandardPassingYear = twelthStandardPassingYear;
    }

    public String getTwelthStndardCgpa() {
        return twelthStndardCgpa;
    }

    public void setTwelthStndardCgpa(String twelthStndardCgpa) {
        this.twelthStndardCgpa = twelthStndardCgpa;
    }

    public String getTenthStandard() {
        return tenthStandard;
    }

    public void setTenthStandard(String tenthStandard) {
        this.tenthStandard = tenthStandard;
    }

    public String getTenthStandardSchoolName() {
        return tenthStandardSchoolName;
    }

    public void setTenthStandardSchoolName(String tenthStandardSchoolName) {
        this.tenthStandardSchoolName = tenthStandardSchoolName;
    }

    public String getTenthStandardBoardName() {
        return tenthStandardBoardName;
    }

    public void setTenthStandardBoardName(String tenthStandardBoardName) {
        this.tenthStandardBoardName = tenthStandardBoardName;
    }

    public String getTenthStandardPassingYear() {
        return tenthStandardPassingYear;
    }

    public void setTenthStandardPassingYear(String tenthStandardPassingYear) {
        this.tenthStandardPassingYear = tenthStandardPassingYear;
    }

    public String getTenthStandardCgpa() {
        return tenthStandardCgpa;
    }

    public void setTenthStandardCgpa(String tenthStandardCgpa) {
        this.tenthStandardCgpa = tenthStandardCgpa;
    }

    public EducationDetails(Long id, String gDegreeName, String gUniversityName, String gCollegeName,
            String gPassingYear, String gBacklogs, String gBacklogsCleared, String graduationCgpa, String educationGap,
            String educationGapDuration, String pgDegree, String pgDegreeName, String pgUniversityName,
            String pgCollegeName, String pgPassingYear, String pgBacklogs, String pgBacklogsCleared, String pgCgpa,
            String pgEducationgap, String pgEducationgapDuration, String twelthStandard,
            String twelthStandardSchoolName, String twelthStandardBoardName, String twelthStandardPassingYear,
            String twelthStndardCgpa, String tenthStandard, String tenthStandardSchoolName,
            String tenthStandardBoardName, String tenthStandardPassingYear, String tenthStandardCgpa) {
        Id = id;
        this.gDegreeName = gDegreeName;
        this.gUniversityName = gUniversityName;
        this.gCollegeName = gCollegeName;
        this.gPassingYear = gPassingYear;
        this.gBacklogs = gBacklogs;
        this.gBacklogsCleared = gBacklogsCleared;
        this.graduationCgpa = graduationCgpa;
        this.educationGap = educationGap;
        this.educationGapDuration = educationGapDuration;
        this.pgDegree = pgDegree;
        this.pgDegreeName = pgDegreeName;
        this.pgUniversityName = pgUniversityName;
        this.pgCollegeName = pgCollegeName;
        this.pgPassingYear = pgPassingYear;
        this.pgBacklogs = pgBacklogs;
        this.pgBacklogsCleared = pgBacklogsCleared;
        this.pgCgpa = pgCgpa;
        this.pgEducationgap = pgEducationgap;
        this.pgEducationgapDuration = pgEducationgapDuration;
        this.twelthStandard = twelthStandard;
        this.twelthStandardSchoolName = twelthStandardSchoolName;
        this.twelthStandardBoardName = twelthStandardBoardName;
        this.twelthStandardPassingYear = twelthStandardPassingYear;
        this.twelthStndardCgpa = twelthStndardCgpa;
        this.tenthStandard = tenthStandard;
        this.tenthStandardSchoolName = tenthStandardSchoolName;
        this.tenthStandardBoardName = tenthStandardBoardName;
        this.tenthStandardPassingYear = tenthStandardPassingYear;
        this.tenthStandardCgpa = tenthStandardCgpa;
    }

    public EducationDetails() {
    }

    @Override
    public String toString() {
        return "EducationDetails [Id=" + Id + ", gDegreeName=" + gDegreeName + ", gUniversityName=" + gUniversityName
                + ", gCollegeName=" + gCollegeName + ", gPassingYear=" + gPassingYear + ", gBacklogs=" + gBacklogs
                + ", gBacklogsCleared=" + gBacklogsCleared + ", graduationCgpa=" + graduationCgpa + ", educationGap="
                + educationGap + ", educationGapDuration=" + educationGapDuration + ", pgDegree=" + pgDegree
                + ", pgDegreeName=" + pgDegreeName + ", pgUniversityName=" + pgUniversityName + ", pgCollegeName="
                + pgCollegeName + ", pgPassingYear=" + pgPassingYear + ", pgBacklogs=" + pgBacklogs
                + ", pgBacklogsCleared=" + pgBacklogsCleared + ", pgCgpa=" + pgCgpa + ", pgEducationgap="
                + pgEducationgap + ", pgEducationgapDuration=" + pgEducationgapDuration + ", twelthStandard="
                + twelthStandard + ", twelthStandardSchoolName=" + twelthStandardSchoolName
                + ", twelthStandardBoardName=" + twelthStandardBoardName + ", twelthStandardPassingYear="
                + twelthStandardPassingYear + ", twelthStndardCgpa=" + twelthStndardCgpa + ", tenthStandard="
                + tenthStandard + ", tenthStandardSchoolName=" + tenthStandardSchoolName + ", tenthStandardBoardName="
                + tenthStandardBoardName + ", tenthStandardPassingYear=" + tenthStandardPassingYear
                + ", tenthStandardCgpa=" + tenthStandardCgpa + "]";
    }

}
