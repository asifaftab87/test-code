package org.la.student.one.jamal.rest.controller;

import java.util.List;

import org.la.student.one.jamal.model.Room;
import org.la.student.one.jamal.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jamalRoomRestController")
@RequestMapping("/room")
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
	
	@PostMapping("/create")
	public Room create(@RequestBody Room room) {
		return roomService.create(room);
	}
	
	@PostMapping("/update")
	public Room update(@RequestBody Room room) {
		return roomService.update(room);
	}

}
