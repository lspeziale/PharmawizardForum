package com.pharmawizard.domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "USER_PROFILE")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COMMENT", nullable = false, updatable = false)
	private Long idComment;

	@Column(name = "AUTHOR", nullable = false, unique = false)
	private String author;

	@Column(name = "TEXT", nullable = false, unique = false)
	private String text;

	@Column(name = "DATE_CREATED", nullable = false, unique = false)
	private Date date;

	// Relation between Topic & Comment
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonManagedReference
	@JoinColumn(name = "TOPIC_COMMENT")
	private Topic topics;

	// Relation between UserProfile & Comment
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonManagedReference
	@JoinColumn(name = "USER_COMMENT")
	private UserProfile users;

	public Long getIdComment() {
		return idComment;
	}

	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Topic getTopics() {
		return topics;
	}

	public void setTopics(Topic topics) {
		this.topics = topics;
	}

	public UserProfile getUsers() {
		return users;
	}

	public void setUsers(UserProfile users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((idComment == null) ? 0 : idComment.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((topics == null) ? 0 : topics.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idComment == null) {
			if (other.idComment != null)
				return false;
		} else if (!idComment.equals(other.idComment))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (topics == null) {
			if (other.topics != null)
				return false;
		} else if (!topics.equals(other.topics))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comment [idComment=");
		builder.append(idComment);
		builder.append(", author=");
		builder.append(author);
		builder.append(", text=");
		builder.append(text);
		builder.append(", date=");
		builder.append(date);
		builder.append(", topics=");
		builder.append(topics);
		builder.append(", users=");
		builder.append(users);
		builder.append("]");
		return builder.toString();
	}

}
