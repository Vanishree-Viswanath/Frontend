import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { EmployeeLoginService } from './employee-login.service';
import { HeaderComponent } from './header/header.component';
import { SideNavigationComponent } from './side-navigation/side-navigation.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';
import { TableModule } from 'primeng/table';
import { StateComponent } from './dashboard/components/state/state.component';
import { CountryComponent } from './dashboard/components/country/country.component';
import { ButtonModule } from 'primeng/button';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PaginatorModule } from 'primeng/paginator';
import { SkillsComponent } from './dashboard/components/skills/skills.component';
import { LoginSuccessComponent } from './login/login-success/login-success.component';
import { RegistrationComponent } from './registration/registration.component';
import { LanguageComponent } from './dashboard/components/language/language.component';
import { PersonaldetailsComponent } from './dashboard/components/personaldetails/personaldetails.component';
import { EducationDetailsComponent } from './dashboard/components/education-details/education-details.component';
import { CityComponent } from './dashboard/components/city/city.component';
import { LogoutComponent } from './logout/logout.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    HeaderComponent,
    SideNavigationComponent,
    StateComponent,
    CountryComponent,
    SkillsComponent,
    LoginSuccessComponent,
    RegistrationComponent,
    LanguageComponent,
    PersonaldetailsComponent,
    EducationDetailsComponent,
    CityComponent,
    LogoutComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    ButtonModule,
    RouterModule,
    TableModule,
    NgbModule,
    PaginatorModule,
  ],
  providers: [EmployeeLoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
