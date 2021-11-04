package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;


import org.la.student.one.tahir.model.City;
import org.la.student.one.tahir.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;
	
	public City findById(long id) {
		Optional<City> optional = cityRepository.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<City> findAll(){
		return cityRepository.findAll();
				
			
	}
	
	public List<City> findByCity(String name){
		
		return cityRepository.findByCity(name);
	}
	
	public City create(City city) {
	
		
		return cityRepository.save(city);
		
	}
}
