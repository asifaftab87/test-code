package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Suppliers ;
import org.la.student.one.jamal.repository.SuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuppliersService {
	
	@Autowired
	private SuppliersRepository suppliersRepository;
	
	
	public Suppliers  findById(long id) {
		Optional<Suppliers > optional =suppliersRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Suppliers > findAll(){
	return suppliersRepository.findAll();
	
	}
	
	public List<Suppliers > findByContactFName(String contactFNam){
		return suppliersRepository.findByContactFName(contactFNam);
	}
	
	public List<Suppliers > findByContactLName(String contactLNam){
		return suppliersRepository.findByContactLName(contactLNam);
	}

	
	
	
	public Suppliers  create (Suppliers  suppliers ) {
		return suppliersRepository.save(suppliers );
	}
	
	public Suppliers  update (Suppliers  suppliers ) {
		return suppliersRepository.saveAndFlush(suppliers );
	}
	
	
}
