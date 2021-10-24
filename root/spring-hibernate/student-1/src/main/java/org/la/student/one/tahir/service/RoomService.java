package org.la.student.one.tahir.service;

import java.util.List;
import java.util.Optional;


import org.la.student.one.tahir.model.Company;
import org.la.student.one.tahir.model.Room;
import org.la.student.one.tahir.repository.CompanyRepository;
import org.la.student.one.tahir.repository.RoomRepository;
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
	
	public List<Room> findByFloorNum(String name){
		
		return roomRepository.findByFloorNum(name);
	}
	
	public Room create(Room room) {
		return roomRepository.save(room);
		
	}
}
