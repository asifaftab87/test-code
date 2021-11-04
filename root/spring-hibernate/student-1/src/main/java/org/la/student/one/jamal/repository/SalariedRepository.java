package org.la.student.one.jamal.repository;


import org.la.student.one.jamal.model.Salaried;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jamalSalariedRepository")
public interface SalariedRepository extends JpaRepository<Salaried, Long> {
	


}
