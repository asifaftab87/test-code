package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;


import org.la.student.one.tahir.model.Employee;

import org.la.student.one.tahir.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee findById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id); 
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
				
			
	}
	
	public List<Employee> findByFirstName(String name){
		
		return employeeRepository.findByName(name);
	}
	
	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
		
	}

}
