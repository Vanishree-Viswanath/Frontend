package com.app.loginandregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.loginandregister.model.State;

@Repository
public interface StateRepo extends JpaRepository<State, Long> {

}
