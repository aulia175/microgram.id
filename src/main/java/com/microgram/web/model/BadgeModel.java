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
@Table(name = "badge")
public class BadgeModel implements Serializable {

	//base
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	@NotNull
	@Column(name = "date_created", nullable = false)
	private Date dateCreated;	

	@NotNull
	@Column(name = "date_gained", nullable = false)
	private Date dateGained;	
	
	@NotNull
	@Column(name = "nama", nullable = false)
	private String nama;

	@NotNull
	@Column(name = "deskripsi")
	private String deskripsi;
	
	@NotNull
	@Column(name = "time_created")
	private String timeCreated;

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

	public Date getDateGained() {
		return dateGained;
	}

	public void setDateGained(Date dateGained) {
		this.dateGained = dateGained;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public String getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
	}
	
	
}