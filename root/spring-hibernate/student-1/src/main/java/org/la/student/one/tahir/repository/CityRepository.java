package org.la.student.one.tahir.repository;

import java.util.List;



import org.la.student.one.tahir.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository  extends JpaRepository<City, Long>{

	public List<City> findByName(String name);
}
