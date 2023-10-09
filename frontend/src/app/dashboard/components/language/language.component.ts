import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-language',
  templateUrl: './language.component.html',
  styleUrls: ['./language.component.css']
})
export class LanguageComponent implements OnInit {
  selectedLanguage: string = '';
  read:boolean = false;
  write: boolean = false;
  speak: boolean = false;
  certificate: string='';

  constructor(){}

  ngOnInit() {

  }

  onSubmit(){

  }
}
