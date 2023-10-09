package com.app.loginandregister.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.loginandregister.model.City;
import com.app.loginandregister.repository.CityRepo;

@Service
public class CityService {
    @Autowired
    private CityRepo cityRepo;

    public List<City> getAllCities() {
        return cityRepo.findAll();
    }

    public Optional<City> getCityById(Long id) {
        return cityRepo.findById(id);
    }

    public City createCity(City city) {
        return cityRepo.save(city);
    }

    public void updateCity(Long id, City updateCity) {
        if (cityRepo.existsById(id)) {
            updateCity.setId(id);
            cityRepo.save(updateCity);
        }
    }

    public void deleteCity(Long id) {
        cityRepo.deleteById(id);

    }
}
