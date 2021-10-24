package org.la.student.one.tahir.repository;

import java.util.List;


import org.la.student.one.tahir.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository  extends JpaRepository<Orders, Long>{

	public List<Orders> findByUserId(String name);
}
