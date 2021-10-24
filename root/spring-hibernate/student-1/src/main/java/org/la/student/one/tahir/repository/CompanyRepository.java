package org.la.student.one.tahir.repository;

import java.util.List;


import org.la.student.one.tahir.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Company, Long>{

	public List<Company> findByName(String name);
}
