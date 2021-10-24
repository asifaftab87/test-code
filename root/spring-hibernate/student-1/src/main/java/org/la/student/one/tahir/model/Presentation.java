package org.la.student.one.tahir.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Presentation")
public class Presentation implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "presentationId")
	private Long presentationId;
	
	@Column(name = "bookedCompanyId")
	private String bookedCompanyId;
	
	@Column(name = "bookedRoomId")
	private String bookedRoomId;
	
	@Column(name = "startTime")
	private String startTime;
	
	@Column(name = "endTime")
	private String endTime;

	public Long getPresentationId() {
		return presentationId;
	}

	public void setPresentationId(Long presentationId) {
		this.presentationId = presentationId;
	}

	public String getBookedCompanyId() {
		return bookedCompanyId;
	}

	public void setBookedCompanyId(String bookedCompanyId) {
		this.bookedCompanyId = bookedCompanyId;
	}

	public String getBookedRoomId() {
		return bookedRoomId;
	}

	public void setBookedRoomId(String bookedRoomId) {
		this.bookedRoomId = bookedRoomId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Presentation [presentationId=" + presentationId + ", bookedCompanyId=" + bookedCompanyId
				+ ", bookedRoomId=" + bookedRoomId + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
}