import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Skills } from './skills';

@Injectable({
  providedIn: 'root'
})
export class SkillsService {
  private apiUrl = 'http://localhost:8080/skills';
  constructor(private http: HttpClient) { }

  saveSkillsToDb(skills: Skills): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/saveSkills`, skills);
  }

  getSkillsFromDb(skillId: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/getSkills/${skillId}`);
  }

  updateSkillsInDb(updatedSkills: any): Observable<any> {
    return this.http.put<any>(`${this.apiUrl}/updateSkills`, updatedSkills);
  }

  deleteSkillsFromDb(skillId: number): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/deleteSkills/${skillId}`)
  }
}
