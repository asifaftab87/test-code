package org.la.student.one.tahir.repository;

import java.util.List;


import org.la.student.one.tahir.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long>{

	public List<Room> findByFloorNum(String name);
}
