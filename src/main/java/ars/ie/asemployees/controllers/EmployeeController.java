package ars.ie.asemployees.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ars.ie.asemployees.models.Employee;
import ars.ie.asemployees.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public Employee geyEmployee() {
		return employeeService.getEmployee("1234");
	}
}
