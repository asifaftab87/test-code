package org.la.student.one.tahir.rest.controller;

import java.util.List;

import org.la.student.one.tahir.model.Countries;
import org.la.student.one.tahir.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/countries")
public class CountriesRestController {
	

	@Autowired
	private CountriesService countriesService;
	
	@GetMapping("/findAll")
	public List<Countries> findAll(){
		return countriesService.findAll();
	}
	@GetMapping("/findById/{id}")
	public Countries findById(@PathVariable("id") long id) {
		return countriesService.findById(id);
	}

	@PostMapping("/create")
	public Countries create(@RequestBody Countries countries) {
		return countriesService.create(countries);
	}
	

}
