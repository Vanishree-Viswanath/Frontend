import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EducationDetailsService } from './education-details.service';

@Component({
  selector: 'app-education-details',
  templateUrl: './education-details.component.html',
  styleUrls: ['./education-details.component.css']
})
export class EducationDetailsComponent implements OnInit {

  educationForm: FormGroup;

  constructor(private fb: FormBuilder, private educationDetailsService: EducationDetailsService) { }

  ngOnInit() {
    this.educationForm = this.fb.group({
      gDegreeName: ['', Validators.required],
      gUniversityName: ['', Validators.required],
      gCollegeName: ['', Validators.required],
      gPassingYear: ['', Validators.required],
      gBacklogs: ['', Validators.required],
      gBacklogsCleared: ['', Validators.required],
      graduationCgpa: ['', Validators.required],
      educationGap: ['', Validators.required],
      educationGapDuration: [''],
      pgDegree: [''],
      pgDegreeName: [''],
      pgUniversityName: [''],
      pgCollegeName: [''],
      pgPassingYear: [''],
      pgBacklogs: [''],
      pgBacklogsCleared: [''],
      pgCgpa: [''],
      pgEducationgap: [''],
      pgEducationgapDuration: [''],
      twelthStandard: ['', Validators.required],
      twelthStandardSchoolName: ['', Validators.required],
      twelthStandardBoardName: ['', Validators.required],
      twelthStandardPassingYear: ['', Validators.required],
      twelthStandardCgpa: ['', Validators.required],
      tenthStandard: ['', Validators.required],
      tenthStandardSchoolName: ['', Validators.required],
      tenthStandardBoardName: ['', Validators.required],
      tenthStandardPassingYear: ['', Validators.required],
      tenthStandardCgpa: ['', Validators.required]
    })
  }

  onSubmit() {
    if (this.educationForm.valid) {
      this.educationDetailsService.saveEducationDetails(this.educationForm.value).subscribe(
        reponse => {
          console.log('Data Saved Successfully', reponse);
        },
        error => {
          console.error('Error saving data', error);
        }
      );
    } else {
      console.log("Please fill in all required fields");
    }
  }

  resetForm() {
    this.educationForm.reset();
  }
}
