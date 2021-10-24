package org.la.student.one.tahir.rest.controller;

import java.util.List;

import org.la.student.one.tahir.model.User;
import org.la.student.one.tahir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/user")
public class UserRestController {
	

	@Autowired
	private UserService userService;
	
	@GetMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	@GetMapping("/findById/{id}")
	public User findById(@PathVariable("id") long id) {
		return userService.findById(id);
	}

	@PostMapping("/create")
	public User create(@RequestBody User user) {
		return userService.create(user);
	}
	

}
