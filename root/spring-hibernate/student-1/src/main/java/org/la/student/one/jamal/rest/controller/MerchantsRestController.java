package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Merchants;
import org.la.student.one.jamal.service.MerchantsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalMerchantsRestController")
@RequestMapping("/merchants")
public class MerchantsRestController {
	
	@Autowired
	
	private MerchantsService merchantsService;
	
	@GetMapping("/findAll")
	public List<Merchants> findAll(){
		return merchantsService.findAll();
		
	}
		
	@GetMapping("/findById/{id}")
	public Merchants findById(@PathVariable("id") long id) {
		return merchantsService.findById(id);
	
	}
	
	@GetMapping("/findByMerchantName/{merchantName}")
	public List<Merchants> findByMerchantName(@PathVariable("merchantName") String merchantName ) {
		return merchantsService.findByMerchantName(merchantName);
	
	}
	
	@PostMapping("/create")
	public Merchants create(@RequestBody Merchants merchants) {
		return merchantsService.create(merchants);
	}
	
	@PostMapping("/update")
	public Merchants update(@RequestBody Merchants merchants) {
		return merchantsService.update(merchants);
	}

}
