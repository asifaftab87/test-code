package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Presentation;
import org.la.student.one.jamal.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jamalPresentationService")
public class PresentationService {
	
	@Autowired
	private PresentationRepository presentationRepository;
	
	
	public Presentation findById(Long id) {
		Optional<Presentation> optional =presentationRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Presentation> findAll(){;
	return presentationRepository.findAll();
	
	}
	
	
	public Presentation create (Presentation presentation) {
		return presentationRepository.save(presentation);
	}
	
	public Presentation update (Presentation presentation) {
		return presentationRepository.saveAndFlush(presentation);
	}
	
	
}
