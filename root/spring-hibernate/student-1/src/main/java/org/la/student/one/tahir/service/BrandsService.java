package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;


import org.la.student.one.tahir.model.Brands;
import org.la.student.one.tahir.repository.BrandsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandsService {

	@Autowired
	private BrandsRepository brandsRepository;
	
	public Brands findById(long id) {
		Optional<Brands> optional = brandsRepository.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<Brands> findAll(){
		return brandsRepository.findAll();
				
			
	}
	
	public List<Brands> findByBrandName(String name){
		
		return brandsRepository.findByBrandName(name);
	}
	
	public Brands create(Brands brands) {
	
		
		return brandsRepository.save(brands);
		
	}
}
