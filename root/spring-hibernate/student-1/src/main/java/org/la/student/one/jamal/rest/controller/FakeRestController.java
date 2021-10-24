package org.la.student.one.jamal.rest.controller;

import org.la.student.one.jamal.service.FakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalFakeRestController")
@RequestMapping ("/fake1")
public class FakeRestController {
	
	@Autowired
	FakeService fakeService;
	
	@GetMapping("/byname1 ")
	public String byName() {
		return fakeService.findByName();
	}

}
 