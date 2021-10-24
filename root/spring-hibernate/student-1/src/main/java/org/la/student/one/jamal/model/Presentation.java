package org.la.student.one.jamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="presentation")
public class Presentation implements Serializable {
	
	
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	@Column (name="id")
	private Long id;
	
	@Column (name="presentationId")
	private Long presentationId; 
	
	@Column(name="bookedCompanyId")
	private Long bookedCompanyId; 
	
	@Column(name="bookedRoomId")
	private Long bookedRoomId; 
	
	@Column(name="startTime")
	private Long startTime;
	
	@Column(name="endtTime")
	private Long endtTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPresentationId() {
		return presentationId;
	}

	public void setPresentationId(Long presentationId) {
		this.presentationId = presentationId;
	}

	public Long getBookedCompanyId() {
		return bookedCompanyId;
	}

	public void setBookedCompanyId(Long bookedCompanyId) {
		this.bookedCompanyId = bookedCompanyId;
	}

	public Long getBookedRoomId() {
		return bookedRoomId;
	}

	public void setBookedRoomId(Long bookedRoomId) {
		this.bookedRoomId = bookedRoomId;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndtTime() {
		return endtTime;
	}

	public void setEndtTime(Long endtTime) {
		this.endtTime = endtTime;
	}

	@Override
	public String toString() {
		return "Presentation [id=" + id + ", presentationId=" + presentationId + ", bookedCompanyId=" + bookedCompanyId
				+ ", bookedRoomId=" + bookedRoomId + ", startTime=" + startTime + ", endtTime=" + endtTime + "]";
	}
	
	
	
	

}
