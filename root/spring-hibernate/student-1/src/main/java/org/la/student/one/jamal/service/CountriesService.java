package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Countries;
import org.la.student.one.jamal.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jamalCountriesService")
public class CountriesService {
	
	@Autowired
	private CountriesRepository countriesRepository;
	
	
	public Countries findById(long id) {
		Optional<Countries> optional =countriesRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Countries> findAll(){
	return countriesRepository.findAll();
	
	}
	
	public List<Countries> findByName(String Name){
		return countriesRepository.findByName(Name);
	}
	
	public List<Countries> findByContinentName(String continentName){
		return countriesRepository.findByContinentName(continentName);
	}
	
	public Countries create (Countries countries) {
		return countriesRepository.save(countries);
	}
	
	public Countries update (Countries countries) {
		return countriesRepository.saveAndFlush(countries);
	}
	
	
}
