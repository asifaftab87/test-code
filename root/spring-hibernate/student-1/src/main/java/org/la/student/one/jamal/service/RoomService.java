package org.la.student.one.jamal.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.jamal.model.Room;
import org.la.student.one.jamal.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	
	public Room findById(long id) {
		Optional<Room> optional = roomRepository.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<Room> findAll(){
		return roomRepository.findAll();
		
	}
	
    public Room create (Room room) {
    	return roomRepository.save(room);
    }
    
    public Room update (Room room ) {
    	Optional<Room> optional = roomRepository.findById(room.getId());
    	if (optional.isPresent()) {
    		Room room2 = optional.get();
    		room2.setFloorNum(room.getFloorNum());
    		room2.setRoomId(room.getRoomId());
    		room2.setSeatCapacity(room.getSeatCapacity());
    		room2 = roomRepository.saveAndFlush(room2);
    		return room2; 
    	}
    	return null ;
    }

}
