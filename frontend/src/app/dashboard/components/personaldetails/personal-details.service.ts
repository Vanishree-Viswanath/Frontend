import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonalDetailsService {
  private baseurl = 'http://localhost:8080/personal_details'

  constructor(private http: HttpClient) { }

  savePersonalDetail(personalDetail: any) {
    return this.http.post(`${this.baseurl}/save`, personalDetail)
  }

  getAllPersonalDetails(): Observable<any> {
    return this.http.get('${this.baseurl}/all');
  }

  getPersonalDetailById(id: number): Observable<any> {
    return this.http.get('${this.baseurl}/id');
  }

  updatePersonalDetail(id: number, updatedData: any): Observable<any> {
    return this.http.put('${this.baseurl}/update/${id}', updatedData);
  }

  deletePersonalDetail(id: number): Observable<any> {
    return this.http.delete('${this.baseurl}/delete/${id}');
  }

}
