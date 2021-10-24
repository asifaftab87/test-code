package org.la.student.one.tahir.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "company")
public class Company implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "primary_contact_attendee_id")
	private String primary_contact_attendee_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrimary_contact_attendee_id() {
		return primary_contact_attendee_id;
	}

	public void setPrimary_contact_attendee_id(String primary_contact_attendee_id) {
		this.primary_contact_attendee_id = primary_contact_attendee_id;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", description=" + description
				+ ", primary_contact_attendee_id=" + primary_contact_attendee_id + "]";
	}
	
	
}