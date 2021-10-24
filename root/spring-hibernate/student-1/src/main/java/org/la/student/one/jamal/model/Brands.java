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
@Table(name= "brands")
public class Brands implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="brandName")
	private String fullName;
	
	
	@Column(name="thumbnails")
	private String thumbnails;


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


	public String getThumbnails() {
		return thumbnails;
	}


	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}


	@Override
	public String toString() {
		return "Brands [id=" + id + ", fullName=" + fullName + ", thumbnails=" + thumbnails + "]";
	}

	
	
	 

	
	
	
	
	 

}
