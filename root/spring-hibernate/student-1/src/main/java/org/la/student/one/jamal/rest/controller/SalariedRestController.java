package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Salaried;
import org.la.student.one.jamal.service.SalariedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salaried")
public class SalariedRestController {
	
	@Autowired
	private SalariedService salariedService;
	
	@GetMapping("/findAll")
	public List<Salaried> findAll(){
		return salariedService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Salaried findById(@PathVariable("id") long id) {
		return salariedService.findById(id);
	
	}
	
	
	
	@PostMapping("/create")
	public Salaried create(@RequestBody Salaried salaried) {
		return salariedService.create(salaried);
	}
	
	@PostMapping("/update")
	public Salaried update(@RequestBody Salaried salaried) {
		return salariedService.update(salaried);
	}

}
