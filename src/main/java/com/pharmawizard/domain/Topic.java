package com.pharmawizard.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Topic")
public class Topic {

	@Id
	@GeneratedValue
	@Column(name="ID_TOPIC", nullable=false, unique=true)
	private Long idTopic;
	
	@Column(name="TITLE", nullable=false, unique=true)
	private String title;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_USER")
	private UserProfile author;
	
	@Column(name="DATE_CREATED", nullable=false, unique=false)
	private Date date;
	
	@Column(name="VIEWS", nullable=false, unique=false)
	private Long views;
	
	public Long getId() {
		return idTopic;
	}
	public void setId(Long id) {
		this.idTopic = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public UserProfile getAuthor() {
		return author;
	}
	public void setAuthor(UserProfile author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getViews() {
		return views;
	}
	public void setViews(Long views) {
		this.views = views;
	}
	
}
