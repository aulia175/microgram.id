package com.microgram.web.model;


import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "user")
public class UserModel implements Serializable {

	//base
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "username", nullable = false)
	private String username;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "password", nullable = false)
	private String password;
	
	@NotNull
	@Column(name = "role", nullable = false)
	private String role;
	
	@NotNull
	@Column(name = "date_created", nullable = false)
	private Date dateCreated;
	
	@NotNull
	@Column(name = "email", nullable = false)
	private String email;
	
	@NotNull
	@Column(name = "nama", nullable = false)
	private String nama;

	@NotNull
	@Column(name = "tentang", nullable = false)
	private String tentang;

	//URLS
	@Column(name = "twitter_url")
	private String twitterUrl;
	
	@Column(name = "soundcloud_url")
	private String soundcloudUrl;

	@Column(name = "spotify_url")
	private String spotifyUrl;

	@Column(name = "instagram_url")
	private String instagramUrl;

	//UNTUK SEMUA
	

	@OneToMany(mappedBy = "user")
	private List<CommentModel> commentList;

	@OneToMany(mappedBy = "user")
	private List<EventModel> eventList;
	
	@OneToMany(mappedBy = "user")
	private List<ArtikelModel> artikelList;

	
	//UNTUK FANS
	
	@OneToMany(mappedBy = "user")
	private List<BadgeModel> badgeList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private List<UserModel> fansOf;
	
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "badge_id")
    private BadgeModel activeBadge;
	
    //UNTUK BAND

	@OneToMany(mappedBy = "user")
	private List<StatusModel> statusList;

	@OneToMany(mappedBy = "user")
	private List<UserModel> fansList;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
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

	public String getTwitterUrl() {
		return twitterUrl;
	}

	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}

	public String getSoundcloudUrl() {
		return soundcloudUrl;
	}

	public void setSoundcloudUrl(String soundcloudUrl) {
		this.soundcloudUrl = soundcloudUrl;
	}

	public String getSpotifyUrl() {
		return spotifyUrl;
	}

	public void setSpotifyUrl(String spotifyUrl) {
		this.spotifyUrl = spotifyUrl;
	}

	public String getInstagramUrl() {
		return instagramUrl;
	}

	public void setInstagramUrl(String instagramUrl) {
		this.instagramUrl = instagramUrl;
	}
	
	
		
}