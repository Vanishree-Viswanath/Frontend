import { Injectable } from '@angular/core';
import { City } from './city.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CityService {
  private apiUrl = 'http://localhost:8080/api/cities'
  constructor(private http: HttpClient) { }

  getCities(): Observable<City[]> {
    return this.http.get<City[]>(`${this.apiUrl}`);
  }

  addCity(city: City): Observable<City> {
    return this.http.post<City>(`${this.apiUrl}`, city);
  }
  updateCity(city: City): Observable<City> {
    return this.http.put<City>(`${this.apiUrl}`, city);
  }

  deleteCity(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
