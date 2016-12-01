package com.pharmawizard.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pharmawizard.domain.Topic;

public interface TopicRepository extends PagingAndSortingRepository<Topic, Long>{
	
	

}
