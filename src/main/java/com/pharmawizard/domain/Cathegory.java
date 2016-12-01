package com.pharmawizard.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "CATHEGORY")

public class Cathegory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CATHEGORY", nullable = false, updatable = false)
	private Long idCathegory;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	// Relation between Cathegory & Topic
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonManagedReference
	@JoinColumn(name = "TOPIC_CATHEGORY")
	private Topic topics;

	public Long getIdCathegory() {
		return idCathegory;
	}

	public void setIdCathegory(Long idCathegory) {
		this.idCathegory = idCathegory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Topic getTopics() {
		return topics;
	}

	public void setTopics(Topic topics) {
		this.topics = topics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCathegory == null) ? 0 : idCathegory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((topics == null) ? 0 : topics.hashCode());
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
		Cathegory other = (Cathegory) obj;
		if (idCathegory == null) {
			if (other.idCathegory != null)
				return false;
		} else if (!idCathegory.equals(other.idCathegory))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (topics == null) {
			if (other.topics != null)
				return false;
		} else if (!topics.equals(other.topics))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cathegory [idCathegory=");
		builder.append(idCathegory);
		builder.append(", name=");
		builder.append(name);
		builder.append(", topics=");
		builder.append(topics);
		builder.append("]");
		return builder.toString();
	}

}
