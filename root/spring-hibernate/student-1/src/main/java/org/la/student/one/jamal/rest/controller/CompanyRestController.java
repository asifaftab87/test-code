package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Company;
import org.la.student.one.jamal.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalCompanyRestController")
@RequestMapping("/company")
public class CompanyRestController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/findAll")
	public List<Company> findAll(){
		return companyService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Company findById(@PathVariable("id") long id) {
		return companyService.findById(id);
	
	}
	
	@GetMapping("/findByName/{Name}")
	public List<Company> findByName(@PathVariable("Name") String Name ) {
		return companyService.findByName(Name);
	
	}
	
	@PostMapping("/create")
	public Company create(@RequestBody Company company) {
		return companyService.create(company);
	}
	
	@PostMapping("/update")
	public Company update(@RequestBody Company company) {
		return companyService.update(company);
	}

}
