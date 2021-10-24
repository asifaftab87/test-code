package org.la.student.one.jamal.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name= "countries")
public class Countries implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="code")
	private Long code;
	
	
	@Column(name="name")
	private String name;

	@Column(name="continentName")
	private String continentName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	@Override
	public String toString() {
		return "countries [id=" + id + ", code=" + code + ", name=" + name + ", continentName=" + continentName + "]";
	}

	
	 

	
	
	
	
	 

}
