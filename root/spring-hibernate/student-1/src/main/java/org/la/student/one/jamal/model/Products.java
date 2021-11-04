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

@Entity(name= "products1")
@Table(name= "products")
public class Products implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="merchantId")
	private Long merchantId;
	
	
	@Column(name="name")
	private String name;

	
	@Column(name="price")
	private Long price;
	
	@Column(name="status")
	private String status;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column (name= "createdAt")
    private Date createdAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "products [id=" + id + ", merchantId=" + merchantId + ", name=" + name + ", price=" + price + ", status="
				+ status + ", createdAt=" + createdAt + "]";
	}

	
	
	
	 

	
	
	
	
	 

}
