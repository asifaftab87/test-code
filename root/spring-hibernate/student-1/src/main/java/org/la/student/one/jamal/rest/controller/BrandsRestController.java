package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Brands;
import org.la.student.one.jamal.service.BrandsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalBrandsRestController")
@RequestMapping("/brands")
public class BrandsRestController {
	
	@Autowired
	
	private BrandsService brandsService;
	
	@GetMapping("/findAll")
	public List<Brands> findAll(){
		return brandsService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Brands findById(@PathVariable("id") long id) {
		return brandsService.findById(id);
	
	}
	
	
	
	@PostMapping("/create")
	public Brands create(@RequestBody Brands brands) {
		return brandsService.create(brands);
	}
	
	@PostMapping("/update")
	public Brands update(@RequestBody Brands brands) {
		return brandsService.update(brands);
	}
	

}
