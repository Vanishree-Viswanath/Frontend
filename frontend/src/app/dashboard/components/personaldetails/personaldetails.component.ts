import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PersonalDetailsService } from './personal-details.service';

@Component({
  selector: 'app-personaldetails',
  templateUrl: './personaldetails.component.html',
  styleUrls: ['./personaldetails.component.css']
})
export class PersonaldetailsComponent implements OnInit {

  personalForm: FormGroup;
  isFormSubmitted: boolean = false;

  constructor(private fb: FormBuilder, private personalDetailService: PersonalDetailsService) { }
  ngOnInit() {
    this.personalForm = this.fb.group({
      firstname: ['', Validators.required],
      middlename: [''],
      lastname: ['', Validators.required],
      dateofbirth: ['', Validators.required],
      age: ['', Validators.required],
      gender: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      mobilenum: ['', [Validators.required, Validators.pattern('^[0-9]{10}$')]],
      address: ['', Validators.required],
      country: ['', Validators.required],
      state: ['', Validators.required],
      city: ['', Validators.required],
      pincode: ['', Validators.required],
      alternatenum: ['', Validators.pattern('^[0-9]{10}$')],
      emergencynum: ['', [Validators.required, Validators.pattern('^[0-9]{10}$')]],
      bloodgroup: ['', Validators.required],
      passportavailable: ['', Validators.required],
      passportnum: ['', Validators.required],
      aadharnum: ['', [Validators.required, Validators.pattern('^[0-9]{12}$')]],
      drivinglicense: [''],
      previousempid: [''],
      previousempdetails: [''],
      worklocation: ['', Validators.required],
      maritalstatus: ['', Validators.required]
    })
  }

  onSubmit() {
    this.personalDetailService.savePersonalDetail(this.personalForm.value).subscribe(
      (response) => {
        console.log('Data sent successfully', response);
      },
      (error) => {
        console.log('Error sending data', error);
      }
    );
  }

  resetForm() {
    this.personalForm.reset;
  }

}
