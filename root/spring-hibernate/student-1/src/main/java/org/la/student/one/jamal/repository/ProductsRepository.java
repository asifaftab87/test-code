package org.la.student.one.jamal.repository;

import java.util.List;


import org.la.student.one.jamal.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController("jamalProductsRepository")
public interface ProductsRepository extends JpaRepository<Products , Long> {
	
	public List<Products > findByName(String name);
	

	
	
	
	
	


}
