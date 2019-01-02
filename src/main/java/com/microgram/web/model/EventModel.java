package com.microgram.web.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "event")
public class EventModel implements Serializable {

	//base
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	@NotNull
	@Column(name = "date_created", nullable = false)
	private Date dateCreated;

	@NotNull
	@Column(name = "date_event", nullable = false)
	private Date dateEvent;
	
	@NotNull
	@Column(name = "email", nullable = false)
	private String email;
	
	@NotNull
	@Column(name = "nama", nullable = false)
	private String nama;

	//URLS
	@Column(name = "start_time")
	private String startTime;
	
	@Column(name = "end_time")
	private String endTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
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
	
	
}