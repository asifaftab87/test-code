package org.la.student.one.jamal.repository;

import java.util.List;

import org.la.student.one.jamal.model.Merchants;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("jamaMerchantsRepository")
public interface MerchantsRepository extends JpaRepository<Merchants, Long> {
	
	public List<Merchants> findByMerchantName(String name);
	

	
	
	
	
	


}
