package com.pharmawizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmawizard.domain.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{
	
	public Topic findByTitle(String title);
	
}