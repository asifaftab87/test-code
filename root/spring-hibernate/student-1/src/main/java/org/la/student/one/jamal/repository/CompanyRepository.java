package org.la.student.one.jamal.repository;

import java.util.List;

import org.la.student.one.jamal.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("jamalCompanyRepository")
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	public List<Company> findByName(String Name);

}
