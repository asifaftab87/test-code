package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Salaried;
import org.la.student.one.jamal.repository.SalariedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalariedService {
	
	@Autowired
	private SalariedRepository salariedRepository;
	
	
	public Salaried findById(Long id) {
		Optional<Salaried> optional =salariedRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Salaried> findAll(){
	return salariedRepository.findAll();
	
	}
	
	
	public Salaried create (Salaried salaried) {
		return salariedRepository.save(salaried);
	}
	
	public Salaried update (Salaried salaried) {
		return salariedRepository.saveAndFlush(salaried);
	}
	
	
}
