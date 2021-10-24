package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Customers ;
import org.la.student.one.jamal.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {
	
	@Autowired
	private CustomersRepository customersRepository;
	
	
	public Customers  findById(long id) {
		Optional<Customers > optional =customersRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Customers > findAll(){
	return customersRepository.findAll();
	
	}
	
	public List<Customers > findByFirstName(String firstName){
		return customersRepository.findByFirstName(firstName);
	}
	
	public List<Customers > findByLastName(String lastName){
		return customersRepository.findByLastName(lastName);
	}
	
	public List<Customers > findByClassNum(String classNum){
		return customersRepository.findByClassNum(classNum);
	}
	
	
	
	public Customers  create (Customers  customers ) {
		return customersRepository.save(customers );
	}
	
	public Customers  update (Customers  customers ) {
		return customersRepository.saveAndFlush(customers );
	}
	
	
}
