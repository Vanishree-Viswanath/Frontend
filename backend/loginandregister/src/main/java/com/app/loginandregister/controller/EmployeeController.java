package com.app.loginandregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.loginandregister.model.Employee;
import com.app.loginandregister.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/register")
	public Employee registerUser(@RequestBody Employee emp) throws Exception {
		String tempEmailId = emp.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			Employee empobj = service.fetchEmployeeByEmailId(tempEmailId);
			if (empobj != null) {
				throw new Exception("User with" + tempEmailId + "already exist");
			}
		}
		Employee empObj = null;
		empObj = service.saveUser(emp);
		return empObj;
	}

	@PostMapping("/login")
	public Employee loginUser(@RequestBody Employee emp) throws Exception {
		String tempUserName = emp.getUserName();
		String tempPass = emp.getPassword();
		Employee empobj = null;
		if (tempUserName != null && tempPass != null) {
			empobj = service.fetchEmployeeByUserNameAndPassword(tempUserName, tempPass);
		}
		if (empobj == null) {
			throw new Exception("Bad Credentials");
		}
		return empobj;
	}

}
