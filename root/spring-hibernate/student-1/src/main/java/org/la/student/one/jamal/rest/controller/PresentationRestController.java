package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Presentation;
import org.la.student.one.jamal.service.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Presentation")
public class PresentationRestController {
	
	@Autowired
	private PresentationService presentationService;
	
	@GetMapping("/findAll")
	public List<Presentation> findAll(){
		return presentationService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Presentation findById(@PathVariable("id") long id) {
		return presentationService.findById(id);
	}
	
	@PostMapping("/create")
	public Presentation create (@RequestBody Presentation presentation) {
		return presentationService.create(presentation);
	}
	
	@PostMapping("/update")
	public Presentation updat(@RequestBody Presentation presentation) {
		return presentationService.update(presentation);
	}

}
