package com.example.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employees")
	public Employee employee(@RequestParam(value = "name", defaultValue = "1") String name) {
		EmployeeManager employeeDetails = new EmployeeManager();
		return new Employee(employeeDetails.getEmployees());
	}
}