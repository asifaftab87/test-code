package org.la.student.one.tahir.repository;

import java.util.List;


import org.la.student.one.tahir.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long>{

	public List<Attendee> findByFirstName(String name);

	

}
