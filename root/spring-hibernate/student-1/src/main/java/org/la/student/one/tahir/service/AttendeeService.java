package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;


import org.la.student.one.tahir.model.Attendee;
import org.la.student.one.tahir.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class AttendeeService {

	@Autowired
	private AttendeeRepository attendeeRepository;
	
	public Attendee findById(long id) {
		Optional<Attendee> optional = attendeeRepository.findById(id); 
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<Attendee> findAll(){
		return attendeeRepository.findAll();
				
			
	}
	
	public List<Attendee> findByFirstName(String firstName){
		
		return attendeeRepository.findByFirstName(firstName);
	}
	
	public Attendee create(Attendee attendee) {
		return attendeeRepository.save(attendee);
		
	}
}
