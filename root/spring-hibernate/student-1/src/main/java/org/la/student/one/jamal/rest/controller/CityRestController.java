package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.City;
import org.la.student.one.jamal.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalCityRestController")
@RequestMapping("/city")
public class CityRestController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("/findAll")
	public List<City> findAll(){
		return cityService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public City findById(@PathVariable("id") long id) {
		return cityService.findById(id);
	
	}
	
	
	
	
	@PostMapping("/create")
	public City create(@RequestBody City city) {
		return cityService.create(city);
	}
	
	@PostMapping("/update")
	public City update(@RequestBody City city) {
		return cityService.update(city);
	}

}
