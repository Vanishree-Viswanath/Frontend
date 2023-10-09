import { Component, OnInit, ViewChild } from '@angular/core';
import { City } from './city.model';
import { NgForm } from '@angular/forms';
import { CityService } from './city.service';

@Component({
  selector: 'app-city',
  templateUrl: './city.component.html',
  styleUrls: ['./city.component.css']
})
export class CityComponent implements OnInit {
  cities: City[] = [];
  tableData: City[] = this.cities;
  selectedCity: City = {
    countryName: '', stateName: '', name: '', description: ''
  }
  isViewModalOpen = false;

  isEditModalOpen = false;
  @ViewChild('editForm') editForm: NgForm;

  isAddModalOpen = false;
  addCity: City = { countryName: '', stateName: '', name: '', description: '' }

  isDeleteModalopen = false;

  constructor(private cityService: CityService) { }

  ngOnInit() {
    this.loadCities();
  }

  loadCities() {
    this.cityService.getCities().subscribe(
      cities => {
        this.cities = cities;
        this.tableData = [...this.cities]
      },
      error => {
        console.log('Error loading cities: ', error);
      }
    )
  }

  openAddModal() {
    this.isAddModalOpen = true;
  }
  closeAddModal() {
    this.isAddModalOpen = false;
  }

  addNewCity() {
    this.cityService.addCity(this.addCity).subscribe(
      city => {
        this.cities.push(city);
        this.tableData = [...this.cities];
        console.log('City Added');
      },
      error => {
        console.error('Error adding cities : ', error);
      }
    )
  }

  ViewCity(city: City) {
    this.selectedCity = city;
    this.isViewModalOpen = true;
  }

  closeViewModal() {
    this.isViewModalOpen = false;
    this.selectedCity = null;
  }

  EditCity(city: City) {
    this.isEditModalOpen = true;
    this.selectedCity = { ...city };
  }

  closeEditModal() {
    this.isEditModalOpen = false;
    this.selectedCity = null;
  }

  saveEditedCity() {
    if (this.editForm.valid) {
      const index = this.cities.findIndex(c => c.name === this.selectedCity.name);
      if (index !== -1) {
        this.cities[index] = { ...this.selectedCity };
        this.tableData = [...this.cities];
        this.closeEditModal();
      }
    }
  }
  DeleteCity(city: City) {
    this.selectedCity = city;
    this.isDeleteModalopen = true;
  }
  closeDeleteModal() {
    this.isDeleteModalopen = false;
  }
  DeleteRecord() {
    const index = this.cities.findIndex(c => c.name === this.selectedCity.name);
    if (index !== -1) {
      this.cities.splice(index, 1);
      this.closeDeleteModal();
    }
  }
}
