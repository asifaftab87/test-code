package org.ecom.noor.model;

import java.io.Serializable;

public class Company implements Serializable {
	
	private static final long serialVersionUID = -1582067386243719716L;

	private int id;
	private String Name;
	private String description;
	private int primary_contact_attendee_id;
	
	public Company() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public int getprimary_contact_attendee_id() {
		return primary_contact_attendee_id;
	}
	public void setprimary_contact_attendee_id(int primary_contact_attendee_id) {
		this.primary_contact_attendee_id = primary_contact_attendee_id;
	}

	@Override
	public String toString() {
		return "id: "+id+"   Name: "+Name+"   description: "+description+"   primary_contact_attendee_id: "+primary_contact_attendee_id
				;
	}

}
