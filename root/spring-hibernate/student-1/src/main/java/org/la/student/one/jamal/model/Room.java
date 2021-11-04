package org.la.student.one.jamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name= "room1")
@Table(name= "room")
public class Room implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="room_id")
	private Long roomId;
	
	@Column (name="floor_num")
	private Long floorNum;
	
	@Column (name="seat_capacity")
	private Long seatCapacity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Long getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(Long floorNum) {
		this.floorNum = floorNum;
	}

	public Long getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(Long seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomId=" + roomId + ", floorNum=" + floorNum + ", seatCapacity=" + seatCapacity
				+ "]";
	}
	
	
	
	 

}
