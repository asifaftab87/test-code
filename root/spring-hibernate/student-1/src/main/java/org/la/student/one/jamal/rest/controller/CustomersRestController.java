package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Customers;
import org.la.student.one.jamal.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalCustomersRestController")
@RequestMapping("/customers")
public class CustomersRestController {
	
	@Autowired
	
	private CustomersService CustomersService;
	
	@GetMapping("/findAll")
	public List<Customers> findAll(){
		return CustomersService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Customers findById(@PathVariable("id") long id) {
		return CustomersService.findById(id);
	
	}
	
	@GetMapping("/findByLastName/{lastName}")
	public List<Customers> findByLastName(@PathVariable("lastName") String lastName ) {
		return CustomersService.findByLastName(lastName);
	
	}
	
	@GetMapping("/findByClassNum/{classNum}")
	public List<Customers> findByClassNum(@PathVariable("classNum") String classNum ) {
		return CustomersService.findByClassNum(classNum);
	
	}
	
	@GetMapping("/findByFirstName/{firstName}")
	public List<Customers> findByFirstName(@PathVariable("firstName") String firstName ) {
		return CustomersService.findByFirstName(firstName);
	
	}
	
	@PostMapping("/create")
	public Customers create(@RequestBody Customers Customers) {
		return CustomersService.create(Customers);
	}
	
	@PostMapping("/update")
	public Customers update(@RequestBody Customers Customers) {
		return CustomersService.update(Customers);
	}

}
