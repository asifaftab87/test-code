package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Users;
import org.la.student.one.jamal.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersRestController {
	
	@Autowired
	
	private UsersService usersService;
	
	@GetMapping("/findAll")
	public List<Users> findAll(){
		return usersService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Users findById(@PathVariable("id") long id) {
		return usersService.findById(id);
	
	}
	
	@GetMapping("/findByFullName/{fullName}")
	public List<Users> findByFullName(@PathVariable("fullName") String fullName ) {
		return usersService.findByFullName(fullName);
	
	}
	
	@PostMapping("/create")
	public Users create(@RequestBody Users users) {
		return usersService.create(users);
	}
	
	@PostMapping("/update")
	public Users update(@RequestBody Users users) {
		return usersService.update(users);
	}

}
