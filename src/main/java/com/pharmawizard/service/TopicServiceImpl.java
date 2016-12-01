package com.pharmawizard.service;

import java.util.Collection;
import java.util.Optional;

import com.pharmawizard.domain.Topic;
import com.pharmawizard.repository.TopicRepository;

public class TopicServiceImpl implements TopicService {

	private final TopicRepository topicRepository;

	public TopicServiceImpl(TopicRepository topicService) {
		this.topicRepository = topicService;
	}

	@Override
	public Topic getTopicById(long idTopic) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Collection<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return null;
	}

}
