import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EducationDetailsService {
  private apiurl = 'http://localhost:8080/api/education';

  constructor(private http: HttpClient) { }

  saveEducationDetails(educationDetails: any): Observable<any> {
    return this.http.post(this.apiurl, educationDetails);
  }
}
