package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Suppliers;
import org.la.student.one.jamal.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suppliers")
public class SuppliersRestController {
	
	@Autowired
	
	private SuppliersService SuppliersService;
	
	@GetMapping("/findAll")
	public List<Suppliers> findAll(){
		return SuppliersService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Suppliers findById(@PathVariable("id") long id) {
		return SuppliersService.findById(id);
	
	}
	
	
	
	@GetMapping("/findByContactFName/{contactFName}")
	public List<Suppliers> findByContactFName(@PathVariable("contactFName") String contactFName ) {
		return SuppliersService.findByContactFName(contactFName);
	
	}
	
	@GetMapping("/findByContactLName/{contactLName}")
	public List<Suppliers> findByContactLName(@PathVariable("contactLName") String contactLName ) {
		return SuppliersService.findByContactLName(contactLName);
	
	}
	
	@PostMapping("/create")
	public Suppliers create(@RequestBody Suppliers Suppliers) {
		return SuppliersService.create(Suppliers);
	}
	
	@PostMapping("/update")
	public Suppliers update(@RequestBody Suppliers Suppliers) {
		return SuppliersService.update(Suppliers);
	}

}
