package org.la.student.one.jamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employee1")
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="employeeId")
	private Long employeeId;
	
	@Column (name="employeeName")
	private String employeeName;
	
	@Column (name="employeeNum")
	private Long employeeNum;
	
	@Column(name="cityId")
	private Long cityId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(Long employeeNum) {
		this.employeeNum = employeeNum;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeNum="
				+ employeeNum + ", cityId=" + cityId + "]";
	}

	
	
	
	
	 

}
