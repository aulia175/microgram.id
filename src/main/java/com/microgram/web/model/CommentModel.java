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
@Table(name = "comment")
public class CommentModel implements Serializable {

	//base
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	@NotNull
	@Column(name = "date_created", nullable = false)
	private Date dateCreated;	
	
	@NotNull
	@Column(name = "content")
	private String content;
	
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
	}
	
	
}