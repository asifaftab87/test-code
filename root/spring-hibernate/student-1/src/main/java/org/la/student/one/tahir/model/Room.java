package org.la.student.one.tahir.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "room")
public class Room implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name="room_id")
	private Long roomId;
	
	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public void setFloorNum(String floorNum) {
		this.floorNum = floorNum;
	}

	@Column(name = "floor_num")
	private String floorNum;
	
	@Column(name = "seat_capacity")
	private String seat_capacity;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFloorNum() {
		return floorNum;
	}

	public void setFloor_num(String floorNum) {
		this.floorNum = floorNum;
	}

	public String getSeat_capacity() {
		return seat_capacity;
	}

	public void setSeat_capacity(String seat_capacity) {
		this.seat_capacity = seat_capacity;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", floorNum=" + floorNum + ", seat_capacity=" + seat_capacity + "]";
	}

	
	
	
}