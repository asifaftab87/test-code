package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Products;
import org.la.student.one.jamal.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalProductsRestController")
@RequestMapping("/products")
public class ProductsRestController {
	
	@Autowired
	
	private ProductsService productsService;
	
	@GetMapping("/findAll")
	public List<Products> findAll(){
		return productsService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Products findById(@PathVariable("id") long id) {
		return productsService.findById(id);
	
	}
	
	@GetMapping("/findByName/{name}")
	public List<Products> findByName(@PathVariable("name") String name ) {
		return productsService.findByName(name);
	
	}
	
	@PostMapping("/create")
	public Products create(@RequestBody Products products) {
		return productsService.create(products);
	}
	
	@PostMapping("/update")
	public Products update(@RequestBody Products products) {
		return productsService.update(products);
	}

}
