package org.la.student.one.jamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="attendee1")
@Table(name= "attendee")
public class Attendee implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="attendeeId")
	private Long attendeeId;
	
	@Column (name="firstName")
	private String firstName;
	
	@Column (name="lastName")
	private String lastName;
	
	@Column(name="phone")
	private Long phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="vip")
	private String vip;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAttendeeId() {
		return attendeeId;
	}

	public void setAttendeeId(Long attendeeId) {
		this.attendeeId = attendeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "attendee [id=" + id + ", attendeeId=" + attendeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phone=" + phone + ", email=" + email + ", vip=" + vip + "]";
	}

	
	
	
	
	 

}
