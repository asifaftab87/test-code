package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Attendee;
import org.la.student.one.jamal.service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendee")
public class AttendeeRestController {
	
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
	
	@GetMapping("/findByFirstName/{firstName}")
	public List<Attendee> findByFristName(@PathVariable("firstName") String firstName ) {
		return attendeeService.findByFristName(firstName);
	
	}
	
	@PostMapping("/create")
	public Attendee create(@RequestBody Attendee attendee) {
		return attendeeService.create(attendee);
	}
	
	@PostMapping("/update")
	public Attendee update(@RequestBody Attendee attendee) {
		return attendeeService.update(attendee);
	}

}
