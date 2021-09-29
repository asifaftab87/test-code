package org.ecom.noor.model;

import java.io.Serializable;

public class City implements Serializable{

	private static final long serialVersionUID = -1582067386243719716L;

	private int id;
	private String name;
	
	
	public City() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	

	@Override
	public String toString() {
		return "id: "+id+"   Name: "+name;
	}

}
