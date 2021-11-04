package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Brands;
import org.la.student.one.jamal.repository.BrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jamalBrandsService")
public class BrandsService {
	
	@Autowired
	private BrandsRepository brandsRepository;
	
	
	public Brands findById(long id) {
		Optional<Brands> optional =brandsRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Brands> findAll(){
	return brandsRepository.findAll();
	
	}
	
	
	
	public Brands create (Brands brands) {
		return brandsRepository.save(brands);
	}
	
	public Brands update (Brands brands) {
		return brandsRepository.saveAndFlush(brands);
	}
	
	
	
}
