package org.la.student.one.jamal.repository;

import java.util.List;

import org.la.student.one.jamal.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalEmployeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	public List<Employee> findByEmployeeName(String Name);

}
