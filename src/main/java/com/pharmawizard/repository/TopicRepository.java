package com.pharmawizard.repository;

import org.springframework.data.repository.CrudRepository;

import com.pharmawizard.domain.Topic;

public interface TopicRepository extends CrudRepository<Topic, Long>{
	
	public Topic findByTitle(String title);

}