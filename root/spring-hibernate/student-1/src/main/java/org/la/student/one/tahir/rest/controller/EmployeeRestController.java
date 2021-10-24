package org.la.student.one.tahir.rest.controller;

import java.util.List;


import org.la.student.one.tahir.model.Employee;

import org.la.student.one.tahir.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/employee")
public class EmployeeRestController {


	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/findAll")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	@GetMapping("/findById/{id}")
	public Employee findById(@PathVariable("id") long id) {
		return employeeService.findById(id);
	}

	@PostMapping("/create")
	public Employee create(@RequestBody Employee employee) {
		return employeeService.create(employee);
	}
	
}
