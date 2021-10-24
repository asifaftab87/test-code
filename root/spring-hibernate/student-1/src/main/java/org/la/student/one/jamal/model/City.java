package org.la.student.one.jamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "City")
public class City implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="cityId")
	private Long cityId;
	
	
	@Column(name="City")
	private String City;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCityId() {
		return cityId;
	}


	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	@Override
	public String toString() {
		return "City [id=" + id + ", cityId=" + cityId + ", City=" + City + "]";
	}


	
	
	
	
	 

}
