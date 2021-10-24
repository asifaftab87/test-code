package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Employee;
import org.la.student.one.jamal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public Employee findById(Long id) {
		Optional<Employee> optional =employeeRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Employee> findAll(){
	return employeeRepository.findAll();
	
	}
	
	public List<Employee> findByEmployeeName(String Name){
		return employeeRepository.findByEmployeeName(Name);
	}
	
	
	public Employee create (Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee update (Employee employee) {
		return employeeRepository.saveAndFlush(employee);
	}
	
	
}
