package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.tahir.model.Presentation;
import org.la.student.one.tahir.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresentationService {

	@Autowired
	private PresentationRepository presentationRepository;
	
	public Presentation findById(long id) {
		Optional<Presentation> optional = presentationRepository.findById(id); 
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<Presentation> findAll(){
		return presentationRepository.findAll();
				
			
	}
	
	public List<Presentation> findByFirstName(String name){
		
		return presentationRepository.findBybookedRoomId(name);
	}
	
	public Presentation create(Presentation presentation) {
		return presentationRepository.save(presentation);
		
	}
}
