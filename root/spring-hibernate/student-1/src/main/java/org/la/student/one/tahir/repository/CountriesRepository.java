package org.la.student.one.tahir.repository;

import java.util.List;


import org.la.student.one.tahir.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository  extends JpaRepository<Countries, Long>{

	public List<Countries> findByName(String name);
}
