import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { State } from './state.model';

@Injectable({
  providedIn: 'root'
})
export class StateService {
  private apiUrl = 'http://localhost:8080'
  constructor(private http: HttpClient) { }

  getStates(): Observable<State[]> {
    return this.http.get<State[]>(`${this.apiUrl}/api/states`);
  }

  addState(state: State): Observable<State> {
    return this.http.post<State>(`${this.apiUrl}/api/states`, state);
  }

  updateState(state: State): Observable<State> {
    return this.http.put<State>(`${this.apiUrl}/api/states`, state)
  }

  deleteState(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/api/states/${id}`);
  }
}

