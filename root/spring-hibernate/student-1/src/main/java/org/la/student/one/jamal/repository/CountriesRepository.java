package org.la.student.one.jamal.repository;

import java.util.List;

import org.la.student.one.jamal.model.Countries;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CountriesRepository extends JpaRepository<Countries, Long> {
	
	public List<Countries> findByName(String name);
	
	public List<Countries> findByContinentName (String name);
	
	



}
