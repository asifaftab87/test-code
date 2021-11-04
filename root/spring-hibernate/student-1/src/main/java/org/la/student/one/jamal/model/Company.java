package org.la.student.one.jamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="company2")
@Table(name= "companyA")
public class Company implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="companyId")
	private Long companyId;
	
	@Column (name="name")
	private String name;
	
	@Column (name="description")
	private String description;
	
	@Column(name="primaryContactAttendeeId")
	private Long primaryContactAttendeeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
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

	public Long getPrimaryContactAttendeeId() {
		return primaryContactAttendeeId;
	}

	public void setPrimaryContactAttendeeId(Long primaryContactAttendeeId) {
		this.primaryContactAttendeeId = primaryContactAttendeeId;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyId=" + companyId + ", name=" + name + ", description=" + description
				+ ", primaryContactAttendeeId=" + primaryContactAttendeeId + "]";
	}
	
	
	
	
	 

}
