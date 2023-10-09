import { Component, OnInit } from '@angular/core';
import { Employees } from '../employees';
import { EmployeeLoginService } from '../employee-login.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  employees = new Employees;
  msg = '';

  constructor(private employeeLoginService: EmployeeLoginService, private router: Router) { }

  ngOnInit() {

  }

  registerUser() {
    this.employeeLoginService.registerUser(this.employees).subscribe(
      response => {
        this.msg = 'Registration Successfull'
        this.router.navigate(['/login']);
      },
      error => {
        this.msg = 'Registration Failed. Please try again.'
      }
    )
  }
  reset() {
    this.employees = new Employees();
    this.msg = '';
  }

}
