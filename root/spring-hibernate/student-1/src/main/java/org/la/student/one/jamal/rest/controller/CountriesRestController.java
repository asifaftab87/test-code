package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Countries;
import org.la.student.one.jamal.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalCountriesRestController")
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
	
	@GetMapping("/findByName/{name}")
	public List<Countries> findByName(@PathVariable("name") String name ) {
		return countriesService.findByName(name);
	
	}
	
	@GetMapping("/findByContinentName/{continentName}")
	public List<Countries> findByContinentName(@PathVariable("continentName") String continentName ) {
		return countriesService.findByContinentName(continentName);
	
	}
	
	@PostMapping("/create")
	public Countries create(@RequestBody Countries countries) {
		return countriesService.create(countries);
	}
	
	@PostMapping("/update")
	public Countries update(@RequestBody Countries countries) {
		return countriesService.update(countries);
	}

}
