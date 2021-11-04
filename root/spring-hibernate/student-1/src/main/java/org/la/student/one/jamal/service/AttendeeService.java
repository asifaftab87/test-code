package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Attendee;
import org.la.student.one.jamal.repository.AttendeeRepositoryJamal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jamalAttendeeService")
public class AttendeeService {
	
	@Autowired
	private AttendeeRepositoryJamal attendeeRepository;
	
	
	public Attendee findById(Long id) {
		Optional<Attendee> optional =attendeeRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null ;
		
	}
	
	public List<Attendee> findAll(){
	return attendeeRepository.findAll();
	
	}
	
	public List<Attendee> findByFristName(String firstName){
		return attendeeRepository.findByFirstName(firstName);
	}
	
	
	public Attendee create (Attendee attendee) {
		return attendeeRepository.save(attendee);
	}
	
	public Attendee update (Attendee attendee) {
		return attendeeRepository.saveAndFlush(attendee);
	}
	
	
}
