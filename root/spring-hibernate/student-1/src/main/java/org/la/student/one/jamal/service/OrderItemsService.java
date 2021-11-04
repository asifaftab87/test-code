package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.OrderItems;
import org.la.student.one.jamal.repository.OrderItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jamalOrderItemsService")
public class OrderItemsService {
	
	@Autowired
	private OrderItemsRepository orderItemsRepository;
	
	
	public OrderItems findById(long id) {
		Optional<OrderItems> optional =orderItemsRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<OrderItems> findAll(){
	return orderItemsRepository.findAll();
	
	}
	
	
	public OrderItems create (OrderItems orderItems) {
		return orderItemsRepository.save(orderItems);
	}
	
	public OrderItems update (OrderItems orderItems) {
		return orderItemsRepository.saveAndFlush(orderItems);
	}
	
	
}
