package org.la.student.one.tahir.repository;

import java.util.List;

import org.la.student.one.tahir.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public List<Employee> findByName(String name);

}
