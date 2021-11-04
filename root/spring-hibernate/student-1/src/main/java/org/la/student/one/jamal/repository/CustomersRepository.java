package org.la.student.one.jamal.repository;

import java.util.List;

import org.la.student.one.jamal.model.Customers ;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("jamalCustomersRepository")
public interface CustomersRepository extends JpaRepository<Customers, Long> {
	
	public List<Customers> findByFirstName(String name);
	public List<Customers> findByLastName(String name);
	public List<Customers> findByClassNum(String name);
	

	
	
	
	
	


}
