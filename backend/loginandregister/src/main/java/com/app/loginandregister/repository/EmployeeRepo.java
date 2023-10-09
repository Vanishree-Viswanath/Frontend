package com.app.loginandregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.loginandregister.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	public Employee findByEmailId(String emailId);

	public Employee findByUserNameAndPassword(String username, String password);

	
}
