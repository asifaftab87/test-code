package org.la.student.one.tahir.repository;

import java.util.List;

import org.la.student.one.tahir.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{

	public List<User> findByFirstName(String name);
}
