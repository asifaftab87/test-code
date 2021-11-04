package org.la.view.controller;

import org.la.view.model.dto.AddressDTO;
import org.la.view.model.dto.BalanceDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller()
@RequestMapping("/balance")
public class BalanceController {

	RestTemplate restTemplate = new RestTemplate();
	
	@PostMapping("/create/address")
    public ModelAndView addBalance(@ModelAttribute AddressDTO addressDto) {
		ModelAndView mav = new ModelAndView("result");
		AddressDTO addressDTO2 = restTemplate.postForObject("http://localhost:9191/student/address/create", addressDto, AddressDTO.class);
		mav.addObject("addressDto", addressDTO2);
		return mav;
	}
	
	@GetMapping("/create/address")
    public ModelAndView viewBalance(@ModelAttribute AddressDTO addressDto) {
		ModelAndView mav = new ModelAndView("create-address");
		mav.addObject("addressDto", addressDto);
		return mav;
	}
	
	@GetMapping()
    public ModelAndView viewBalance(@ModelAttribute BalanceDTO balanceDto) {
		ModelAndView mav = new ModelAndView("view-balances");
		mav.addObject("message", "hello world");
		
		//consuming rest services/end point/rest api
		balanceDto = restTemplate.getForObject("http://localhost:9191/student/balance/findById/1?spend=10", BalanceDTO.class);
		mav.addObject("balanceDto", balanceDto);
        return mav;
    }
}
