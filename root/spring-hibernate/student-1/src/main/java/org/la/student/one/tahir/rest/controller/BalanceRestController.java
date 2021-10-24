package org.la.student.one.tahir.rest.controller;

import java.math.BigDecimal;
import java.util.List;

import org.la.student.one.tahir.model.dto.BalanceDTO;
import org.la.student.one.tahir.service.BalanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/balance")
public class BalanceRestController {

	@Autowired
	private BalanceService balanceService;
	
	@GetMapping("/findById/{id}")
	public BalanceDTO findById(@PathVariable("id") long id, @RequestParam("spend") BigDecimal spend) {
		System.out.println("spend: "+spend);
		return balanceService.findById(id, spend);
	}
	
	
}
