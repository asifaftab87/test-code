package org.la.student.one.jamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name= "salaried1")
@Table(name= "salaried")
public class Salaried implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="salariedId")
	private Long salariedId;
	
	
	@Column(name="annualSalary")
	private Long annualSalary;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getSalariedId() {
		return salariedId;
	}


	public void setSalariedId(Long salariedId) {
		this.salariedId = salariedId;
	}


	public Long getAnnualSalary() {
		return annualSalary;
	}


	public void setAnnualSalary(Long annualSalary) {
		this.annualSalary = annualSalary;
	}


	@Override
	public String toString() {
		return "Salaried [id=" + id + ", salariedId=" + salariedId + ", annualSalary=" + annualSalary + "]";
	}

	
	
	
	
	
	 

}
