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

@Entity(name= "Merchants1")
@Table(name= "Merchants")
public class Merchants implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column (name="merchantName")
    private String merchantName; 
	
	@Column(name="adminId")
	private Long adminId;
	
	
	@Column(name="countryCode")
	private Long countryCode;

	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column (name= "createdAt")
    private Date createdAt;
     
	
	
	
	public String getMerchantName() {
		return merchantName;
	}


	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getAdminId() {
		return adminId;
	}


	public void setAdminId(Long adminId) {
		this.adminId = adminId;
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
		return "Merchants [id=" + id + ", merchantName=" + merchantName + ", adminId=" + adminId + ", countryCode="
				+ countryCode + ", createdAt=" + createdAt + "]";
	}


	

	
	
	

	

}
