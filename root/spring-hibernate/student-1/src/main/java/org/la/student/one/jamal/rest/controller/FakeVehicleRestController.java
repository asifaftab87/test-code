package org.la.student.one.jamal.rest.controller;

import org.la.student.one.jamal.service.FakeVehicleI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalFakeVehicleRestController")
@RequestMapping("/fakevehicle1")
public class FakeVehicleRestController {
	
	@Autowired
	@Qualifier("bmw")
	private FakeVehicleI fakeVehicle;
	
	
	@GetMapping("/name1")
	public String findCar() {
		return fakeVehicle.name();
	}
	

}
