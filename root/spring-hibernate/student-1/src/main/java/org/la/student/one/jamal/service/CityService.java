package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.City;
import org.la.student.one.jamal.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jamalCityService")
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;
	
	
	public City findById(long id) {
		Optional<City> optional =cityRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<City> findAll(){
	return cityRepository.findAll();
	
	}
	
	
	
	public City create (City city) {
		return cityRepository.save(city);
	}
	
	public City update (City city) {
		return cityRepository.saveAndFlush(city);
	}
	
	
}
