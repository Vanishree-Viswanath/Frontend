package com.app.loginandregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.loginandregister.model.Employee;
import com.app.loginandregister.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	public Employee saveUser(Employee emp) {
		return repo.save(emp);
	}
	
	public Employee fetchEmployeeByEmailId(String email) {
	 return	repo.findByEmailId(email);
	}
	
	public Employee fetchEmployeeByUserNameAndPassword(String username, String password) {
		return repo.findByUserNameAndPassword(username, password);
	}
}
