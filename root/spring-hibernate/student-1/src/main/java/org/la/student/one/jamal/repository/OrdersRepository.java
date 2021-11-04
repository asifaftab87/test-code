package org.la.student.one.jamal.repository;




import org.la.student.one.jamal.model.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalOrdersRepository")
public interface OrdersRepository extends JpaRepository<Orders, Long> {
	
	
	
	
	


}
