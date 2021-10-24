package org.la.student.one.tahir.repository;

import java.util.List;


import org.la.student.one.tahir.model.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentationRepository  extends JpaRepository<Presentation, Long>{

	public List<Presentation> findBybookedRoomId(String name);
}
