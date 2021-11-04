package org.la.student.one.jamal.repository;

import java.util.List;

import org.la.student.one.jamal.model.Suppliers ;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("jamalSuppliersRepository")
public interface SuppliersRepository extends JpaRepository<Suppliers, Long> {
	
	public List<Suppliers> findByContactFName(String name);
	public List<Suppliers> findByContactLName(String name);

	

	
	
	
	
	


}
