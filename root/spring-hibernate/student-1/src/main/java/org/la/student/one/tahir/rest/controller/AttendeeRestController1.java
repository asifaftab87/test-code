package org.la.student.one.tahir.rest.controller;

import java.util.List;



import org.la.student.one.tahir.model.Attendee;
import org.la.student.one.tahir.service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/attendee1")
public class AttendeeRestController1 {

	@Autowired
	private AttendeeService attendeeService;
	
	@GetMapping("/findAll")
	public List<Attendee> findAll(){
		return attendeeService.findAll();
	}
	@GetMapping("/findById/{id}")
	public Attendee findById(@PathVariable("id") long id) {
		return attendeeService.findById(id);
	}

	@PostMapping("/create")
	public Attendee create(@RequestBody Attendee attendee) {
		return attendeeService.create(attendee);
	}
	
}
