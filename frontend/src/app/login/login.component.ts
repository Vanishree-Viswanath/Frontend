import { Component, OnInit } from '@angular/core';
import { EmployeeLoginService } from '../employee-login.service';
import { Router } from '@angular/router';
import { Employees } from '../employees';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  employees = new Employees();
  msg = '';
  /*model:any = {}
  getData: boolean;*/
  constructor(private emploginservice: EmployeeLoginService,
    private router: Router
  ) { }
  ngOnInit() { }

  loginEmployee() {
    this.emploginservice.loginUserFromRemote(this.employees).subscribe(
      data => {
        console.log("response recieved");
        this.router.navigate(['/dashboard']);
      },
      error => {
        console.log("exception occured");
        this.msg = "Bad Credentials, Please enter valid username and password";
      }
    )
    /*var user = this.model.username;
    var password = this.model.password;

    this.emploginservice.getEmployeeData(user,password).subscribe((res:boolean)=>{
      this.getData = res;

      if(this.getData == true){
        this.router.navigate(["/dashboard"]);
      }else{
        alert("Invalid users")
      }
    })*/
  }

}
