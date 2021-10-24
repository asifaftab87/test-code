package org.la.student.one.jamal.repository;


import java.util.List;

import org.la.student.one.jamal.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
	
	public List<Attendee> findByFirstName (String name);

}
