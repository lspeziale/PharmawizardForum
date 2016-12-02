package com.pharmawizard.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.pharmawizard.domain.Topic;
import com.pharmawizard.repository.TopicRepository;

@Service
public class TopicServiceImpl implements TopicService {

	Logger logger = Logger.getGlobal();

	private final TopicRepository topicRepository;

	public TopicServiceImpl(TopicRepository topicService) {
		this.topicRepository = topicService;
	}

	@Override
	public Topic getTopicById(Long idTopic) {
		return topicRepository.findOne(idTopic);
	}

	@Override
	public List<Topic> getAllTopics() {
		return topicRepository.findAll();
	}

	@Override
	public boolean deleteTopic(Topic topic) {
		if (topicRepository.exists(topic.getIdTopic())) {
			topicRepository.delete(topic);
			return true;
		} else {
			logger.info("The topic doesn't exist");
			return false;
		}
	}

	@Override
	public Topic updateTopic(Topic topic) {
		return topicRepository.save(topic);
	}

}
