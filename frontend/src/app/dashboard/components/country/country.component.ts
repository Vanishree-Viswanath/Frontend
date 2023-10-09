import { Component, OnInit, ViewChild } from '@angular/core';
import { Country } from './country.model';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CountryService } from './country.service';

@Component({
  selector: 'app-country',
  templateUrl: './country.component.html',
  styleUrls: ['./country.component.css'],
})

export class CountryComponent implements OnInit {
  editForm: FormGroup;
  addForm: FormGroup;
  isViewModalOpen = false;
  selectedCountry: Country = {
    name: '',
    description: ''
  };

  countries: Country[] = [];
  tableData: Country[] = this.countries;
  isAddModalOpen = false;
  addCountry: Country = { name: '', description: '' };

  isDeleteCountryModalOpen = false;

  isEditModalOpen = false;

  constructor(private countryService: CountryService) {
    this.addForm = new FormGroup({
      addCountryName: new FormControl('', Validators.required),
      addCountryDescription: new FormControl('', Validators.required)
    })
  }
  ngOnInit() {
    this.editForm = new FormGroup({
      editCountryName: new FormControl('', Validators.required),
      editCountryDescription: new FormControl('', Validators.required)
    });

    this.loadCountries();
  }

  loadCountries() {
    this.countryService.getCountries().subscribe(
      countries => {
        this.countries = countries;
        this.tableData = [...this.countries];
      },
      error => {
        console.log('Error loading countries: ', error);
      }
    )
  }

  openAddModal() {
    this.isAddModalOpen = true;
    console.log('Opening Add Country Modal');
  }

  closeAddModal() {
    this.isAddModalOpen = false;
    this.addCountry = { name: '', description: '' };
  }

  addNewCountry() {
    this.countryService.addCountry(this.addCountry).subscribe(
      country => {
        this.countries.push(country);
        this.tableData = [...this.countries];
        console.log('Country Added');
        this.closeAddModal();
      },
      error => {
        console.error('Error adding country:', error);
      }
    )
  }

  ViewCountry(country: Country) {
    console.log(`Viewing country: ${country.name}`);
    this.selectedCountry = country;
    this.isViewModalOpen = true;
  }

  closeViewModal() {
    this.isViewModalOpen = false;
    this.selectedCountry = null;
  }

  DeleteCountry(country: Country) {
    this.selectedCountry = country;
    this.isDeleteCountryModalOpen = true;
  }

  closeDeleteModal() {
    this.isDeleteCountryModalOpen = false
  }

  deleteCountry() {
    const index = this.countries.findIndex(c => c.name === this.selectedCountry.name);
    if (index !== -1) {
      this.countries.splice(index, 1);
      this.tableData = [...this.countries];
      this.closeDeleteModal();
      console.log('Delete popup closed');
    }
  }

  openEditModal(country: Country) {
    this.editForm.patchValue({
      editCountryName: country.name,
      editCountryDescription: country.description
    });
    this.selectedCountry = { ...country };
    this.isEditModalOpen = true;
  }

  closeEditModal() {
    this.isEditModalOpen = false;
    this.selectedCountry = null;
  }

  saveEditedCountry() {
    if (this.editForm.valid) {
      const index = this.countries.findIndex(c => c.name === this.selectedCountry.name);
      if (index !== -1) {
        this.countries[index] = { ...this.selectedCountry };
        this.tableData = [...this.countries];
        this.closeEditModal();
      }
    }
  }
}
