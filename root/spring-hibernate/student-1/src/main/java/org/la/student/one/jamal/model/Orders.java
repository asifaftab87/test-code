package org.la.student.one.jamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Orders")
public class Orders implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="userId")
	private Long userId;
	
	
	@Column(name="status")
	private String status;

	@Column(name="createdAt")
	private Long createdAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", status=" + status + ", createdAt=" + createdAt + "]";
	}

	
	 

	
	
	
	
	 

}
