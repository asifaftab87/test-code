package org.la.student.one.jamal.repository;




import org.la.student.one.jamal.model.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jamalCityRepository")
public interface CityRepository extends JpaRepository<City, Long> {
	
	
	
	
	


}
