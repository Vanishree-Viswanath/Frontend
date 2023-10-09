import { Component, OnInit, ViewChild } from '@angular/core';
import { State } from './state.model';
import { StateService } from './state.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-state',
  templateUrl: './state.component.html',
  styleUrls: ['./state.component.css']
})

export class StateComponent implements OnInit {
  isViewModalOpen = false;
  selectedState: State = {
    countryName: '',
    name: '',
    description: ''
  };

  states: State[] = [];
  tableData: State[] = this.states;

  editForm: FormGroup;

  isEditModalOpen = false;

  isAddModalOpen = false;
  addState: State = { countryName: '', name: '', description: '' };

  isDeleteModalOpen = false;

  constructor(private stateService: StateService) { }

  ngOnInit() {
    this.editForm = new FormGroup({
      editCountryName: new FormControl('', Validators.required),
      editStateName: new FormControl('', Validators.required),
      editCountryDescription: new FormControl('', Validators.required)
    })
    this.loadStates();
  }

  loadStates() {
    this.stateService.getStates().subscribe(
      states => {
        this.states = states;
        this.tableData = [...this.states];
      },
      error => {
        console.error('Error loading States', error);
      }
    )
  }

  ViewState(state: State) {
    this.selectedState = state;
    this.isViewModalOpen = true;
  }

  closeViewModal() {
    this.isViewModalOpen = false;
    this.selectedState = null;
  }

  openAddModal() {
    this.isAddModalOpen = true;
  }

  EditState(state: State) {
    this.editForm.patchValue({
      editCountryName: state.countryName,
      editStateName: state.name,
      editCountryDescription: state.description
    });
    this.selectedState = { ...state };
    this.isEditModalOpen = true;
  }

  saveEditedState() {
    if (this.editForm.valid) {
      const index = this.states.findIndex(s => s.name === this.selectedState.name);
      if (index !== -1) {
        this.states[index] = { ...this.selectedState };
        this.tableData = [...this.states];
        this.closeEditModal();
      }
    }
  }

  closeEditModal() {
    this.isEditModalOpen = false;
    this.selectedState = null;
  }

  addNewState() {
    this.stateService.addState(this.addState).subscribe(
      state => {
        this.states.push(state);
        this.tableData = [...this.states];
        console.log('State added');
        this.closeAddModal();
      },
      error => {
        console.error('Error adding State', error);
      }
    )
  }

  closeAddModal() {
    this.isAddModalOpen = false;
    this.addState = { countryName: '', name: '', description: '' }
  }


  DeleteState(state: State) {
    this.selectedState = state;
    this.isDeleteModalOpen = true;
  }

  DeleteRecord() {
    const index = this.states.findIndex(s => s.name === this.selectedState.name);
    if (index !== -1) {
      this.states.splice(index, 1);
      this.closeDeleteModal();
    }
  }

  closeDeleteModal() {
    this.isDeleteModalOpen = false;
  }
}
