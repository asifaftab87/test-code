package org.la.student.one.jamal.repository;

import java.util.List;

import org.la.student.one.jamal.model.Countries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("jamalCountriesRepository")
public interface CountriesRepository extends JpaRepository<Countries, Long> {
	
	public List<Countries> findByName(String name);
	
	public List<Countries> findByContinentName (String name);
	
	



}
