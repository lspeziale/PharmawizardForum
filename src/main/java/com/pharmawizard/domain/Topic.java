package com.pharmawizard.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TOPIC")
public class Topic {

	@Id
	@GeneratedValue
	@Column(name = "ID_TOPIC", nullable = false, unique = true)
	private Long idTopic;

	@Column(name = "TITLE", nullable = false, unique = true)
	private String title;

	@Column(name = "DATE_CREATED", nullable = false, unique = false)
	private Date date;

	@Column(name = "VIEWS", nullable = false, unique = false)
	private Long views;

	@Column(name = "LAST_COMMENT", nullable = false, unique = false)
	private String lastComment;

	// Relation between Topic & UserProfile
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonManagedReference
	@JoinColumn(name = "USER_PROFILE")
	private UserProfile users;

	// Relation between Topic & Comment
	@OneToMany(mappedBy = "topics")
	@JsonBackReference
	private List<Comment> comments;

	// Relation between Category & Topic
	@OneToMany(mappedBy = "topics")
	@JsonBackReference
	private List<Category> categories;

	public Long getIdTopic() {
		return idTopic;
	}

	public void setIdTopic(Long idTopic) {
		this.idTopic = idTopic;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public UserProfile getUsers() {
		return users;
	}

	public void setUsers(UserProfile users) {
		this.users = users;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public String getLastComment() {
		return lastComment;
	}

	public void setLastComment(String lastComment) {
		this.lastComment = lastComment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((idTopic == null) ? 0 : idTopic.hashCode());
		result = prime * result + ((lastComment == null) ? 0 : lastComment.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		result = prime * result + ((views == null) ? 0 : views.hashCode());
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
		Topic other = (Topic) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idTopic == null) {
			if (other.idTopic != null)
				return false;
		} else if (!idTopic.equals(other.idTopic))
			return false;
		if (lastComment == null) {
			if (other.lastComment != null)
				return false;
		} else if (!lastComment.equals(other.lastComment))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		if (views == null) {
			if (other.views != null)
				return false;
		} else if (!views.equals(other.views))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Topic [idTopic=");
		builder.append(idTopic);
		builder.append(", title=");
		builder.append(title);
		builder.append(", date=");
		builder.append(date);
		builder.append(", views=");
		builder.append(views);
		builder.append(", lastComment=");
		builder.append(lastComment);
		builder.append(", users=");
		builder.append(users);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", categories=");
		builder.append(categories);
		builder.append("]");
		return builder.toString();
	}

}
