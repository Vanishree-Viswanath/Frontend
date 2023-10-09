import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Employees } from './employees';

@Injectable({
  providedIn: 'root'
})
export class EmployeeLoginService {


  private apiUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) { }

  public loginUserFromRemote(employees: Employees): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/login`, employees)
  }

  registerUser(employees: Employees): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/register`, employees);
  }

  getEmployees(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }

  getEmployeeById(id: number): Observable<any> {
    return this.http.get<any>(this.apiUrl + id);
  }

  createEmployee(employees: Employees): Observable<any> {
    return this.http.post<any>(this.apiUrl, employees);
  }

  updateEmployee(id: number, employees: Employees): Observable<any> {
    return this.http.put<any>(this.apiUrl + employees.id, employees);
  }

  deleteEmployee(id: number): Observable<any> {
    return this.http.delete<any>(this.apiUrl + id);
  }
  /*addRegister(data:any): Observable<any>{
    const endpoint = `${this.apiUrl}/register`;
    return this.http.post<any>(endpoint, data);
  }
  getEmployeeData(username, password){
    return this.http.get('http://localhost:8080/employee/'+username+'/'+password+'');
  }*/
}
