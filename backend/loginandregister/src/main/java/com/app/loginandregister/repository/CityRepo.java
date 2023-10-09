package com.app.loginandregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.loginandregister.model.City;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {

}
