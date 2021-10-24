package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Orders;
import org.la.student.one.jamal.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	
	public Orders findById(long id) {
		Optional<Orders> optional =ordersRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Orders> findAll(){
	return ordersRepository.findAll();
	
	}
	
	
	public Orders create (Orders orders) {
		return ordersRepository.save(orders);
	}
	
	public Orders update (Orders orders) {
		return ordersRepository.saveAndFlush(orders);
	}
	
	
}
