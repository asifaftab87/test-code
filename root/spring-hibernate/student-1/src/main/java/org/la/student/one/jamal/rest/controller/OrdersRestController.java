package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Orders;
import org.la.student.one.jamal.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalOrdersRestController")
@RequestMapping("/orders")
public class OrdersRestController {
	
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping("/findAll")
	public List<Orders> findAll(){
		return ordersService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Orders findById(@PathVariable("id") long id) {
		return ordersService.findById(id);
	
	}
	
	
	
	
	@PostMapping("/create")
	public Orders create(@RequestBody Orders orders) {
		return ordersService.create(orders);
	}
	
	@PostMapping("/update")
	public Orders update(@RequestBody Orders orders) {
		return ordersService.update(orders);
	}

}
