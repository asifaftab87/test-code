package org.la.student.one.jamal.repository;

import org.la.student.one.jamal.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jamalRoomRepository")
public interface RoomRepository extends JpaRepository<Room, Long> {

}
