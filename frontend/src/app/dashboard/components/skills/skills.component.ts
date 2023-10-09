import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SkillsService } from './skills.service';
import { Skills } from './skills';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent {
  skills: Skills = {
    id: 0,
    softSkill: '',
    softSkillProficiency: '',
    technicalSkill: '',
    technicalSkillProficiency: ''
  }
  constructor(private router: Router, private skillsService: SkillsService) { }

  onSaveClick() {
    this.skillsService.saveSkillsToDb(this.skills).subscribe(
      (response) => {
        console.log('Data Saved Successfully:', response);
      },
      (error) => {
        console.log('Error Saving data: ', error);
      }
    );
  }

  onClickCancel() {
    console.log("close is triggered");
    this.router.navigate(['/dashboard']);
  }
}
