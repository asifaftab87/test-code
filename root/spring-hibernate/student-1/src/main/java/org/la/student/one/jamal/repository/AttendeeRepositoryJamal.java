package org.la.student.one.jamal.repository;


import java.util.List;

import org.la.student.one.jamal.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository("attendeeRepositoryJamal")
public interface AttendeeRepositoryJamal extends JpaRepository<Attendee, Long> {
	
	public List<Attendee> findByFirstName (String name);

}
