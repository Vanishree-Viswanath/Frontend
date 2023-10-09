import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-side-navigation',
  templateUrl: './side-navigation.component.html',
  styleUrls: ['./side-navigation.component.css']
})
export class SideNavigationComponent implements OnInit {
  @Input() showPersonalDetailsForms: boolean = true;

  @Output() showPersonalDetails = new EventEmitter<void>();

  showLinks = false;
  isNavActive=false;
  personalDetailsFormVisible = true;
  constructor(){}

  ngOnInit(): void {}

  onClickMasterLink(){
    this.showLinks = !this.showLinks;
    this.personalDetailsFormVisible = !this.showLinks;
    this.isNavActive = this.showLinks;
    console.log('showLinks:', this.showLinks);
  }

  showPersonalDetailsForm(){
    console.log('showPersonalDetailsForm() triggered');
    this.showPersonalDetails.emit();
  }

  onCountryLinkClick(event: Event){
    event.stopPropagation();
  }
}
