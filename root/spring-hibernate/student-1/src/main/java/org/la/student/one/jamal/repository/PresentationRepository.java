package org.la.student.one.jamal.repository;

import org.la.student.one.jamal.model.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("jamalPresentationRepository")
public interface PresentationRepository extends JpaRepository<Presentation, Long> {

}
