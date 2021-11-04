package org.la.student.one.jamal.repository;


import org.la.student.one.jamal.model.OrderItems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalOrderItemsRepository")
public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {
	
	
	
	
	


}
