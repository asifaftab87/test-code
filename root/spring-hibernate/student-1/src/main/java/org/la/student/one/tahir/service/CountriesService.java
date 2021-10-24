package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;


import org.la.student.one.tahir.model.Countries;
import org.la.student.one.tahir.repository.CountriesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesService {

	@Autowired
	private CountriesRepository countriesRepository;
	
	public Countries findById(long id) {
		Optional<Countries> optional = countriesRepository.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<Countries> findAll(){
		return countriesRepository.findAll();
				
			
	}
	
	public List<Countries> findByFirstName(String name){
		
		return countriesRepository.findByName(name);
	}
	
	public Countries create(Countries countries) {
	
		
		return countriesRepository.save(countries);
		
	}
}
