package org.la.student.one.tahir.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Room implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "floor_num")
	private String floor_num;
	
	@Column(name = "seat_capacity")
	private String seat_capacity;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFloor_num() {
		return floor_num;
	}

	public void setFloor_num(String floor_num) {
		this.floor_num = floor_num;
	}

	public String getSeat_capacity() {
		return seat_capacity;
	}

	public void setSeat_capacity(String seat_capacity) {
		this.seat_capacity = seat_capacity;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", floor_num=" + floor_num + ", seat_capacity=" + seat_capacity + "]";
	}

	
	
	
}