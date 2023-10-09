import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Country } from './country.model';

@Injectable({
  providedIn: 'root'
})
export class CountryService {
  private apiUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) { }

  getCountries(): Observable<Country[]> {
    return this.http.get<Country[]>(`${this.apiUrl}/api/countries`)
  }

  addCountry(country: Country): Observable<Country> {
    return this.http.post<Country>(`${this.apiUrl}/api/countries`, country)
  }

  updateCountry(country: Country): Observable<Country> {
    return this.http.put<Country>(`${this.apiUrl}/api/countries`, country);
  }
  deleteCountry(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/api/countries/${id}`);
  }
}
