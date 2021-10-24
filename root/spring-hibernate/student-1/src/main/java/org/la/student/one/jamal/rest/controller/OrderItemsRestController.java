package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.OrderItems;
import org.la.student.one.jamal.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderItems")
public class OrderItemsRestController {
	
	@Autowired
	private OrderItemsService orderItemsService;
	
	@GetMapping("/findAll")
	public List<OrderItems> findAll(){
		return orderItemsService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public OrderItems findById(@PathVariable("id") long id) {
		return orderItemsService.findById(id);
	
	}
	
	
	
	
	@PostMapping("/create")
	public OrderItems create(@RequestBody OrderItems orderItems) {
		return orderItemsService.create(orderItems);
	}
	
	@PostMapping("/update")
	public OrderItems update(@RequestBody OrderItems orderItems) {
		return orderItemsService.update(orderItems);
	}

}
