package org.la.student.one.jamal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "users")
public class Users implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="fullName")
	private String fullName;
	
	
	@Column(name="email")
	private String email;

	@Column(name="gender")
	private String gender;

	@JsonFormat (pattern="yyyy-MM-dd")
	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	
	
	@Column(name="countryCode")
	private Long countryCode;
	
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column (name= "createdAt")
    private Date createdAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Long countryCode) {
		this.countryCode = countryCode;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", fullName=" + fullName + ", email=" + email + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", countryCode=" + countryCode + ", createdAt=" + createdAt + "]";
	}

	
	
	 

	
	
	
	
	 

}
