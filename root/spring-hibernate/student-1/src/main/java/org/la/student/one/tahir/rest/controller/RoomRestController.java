package org.la.student.one.tahir.rest.controller;

import java.util.List;


import org.la.student.one.tahir.model.Room;

import org.la.student.one.tahir.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/room1")
public class RoomRestController {
	

	@Autowired
	private RoomService roomService;
	
	@GetMapping("/findAll")
	public List<Room> findAll(){
		return roomService.findAll();
	}
	@GetMapping("/findById/{id}")
	public Room findById(@PathVariable("id") long id) {
		return roomService.findById(id);
	}
	
	@GetMapping("/findByFloorNum/{floorNum}")
	public Room findByFloorNum(@PathVariable("floorNum") String floorNum) {
		return (Room) roomService.findByFloorNum(floorNum);
	}

	@PostMapping("/create")
	public Room create(@RequestBody Room room) {
		return roomService.create(room);
	}
	

}
