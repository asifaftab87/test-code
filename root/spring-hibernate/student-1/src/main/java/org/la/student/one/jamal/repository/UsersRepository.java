package org.la.student.one.jamal.repository;

import java.util.List;

import org.la.student.one.jamal.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("jamalUsersRepository")
public interface UsersRepository extends JpaRepository<Users, Long> {
	
	public List<Users> findByFullName(String name);
	

	
	
	
	
	


}
