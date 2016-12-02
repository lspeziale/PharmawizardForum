package com.pharmawizard.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmawizard.domain.Topic;
import com.pharmawizard.repository.TopicRepository;
import com.pharmawizard.service.TopicService;

@RestController
@RequestMapping("/topic")
public class TopicController {

	Logger logger = Logger.getGlobal();

	private final TopicService topicService;

	@Autowired
	public TopicController(TopicService topicService) {
		this.topicService = topicService;
	}

	@RequestMapping(value = { "/getTopicModel" }, method = RequestMethod.POST)
	public Topic getTopicModel(Topic topic) {
		return new Topic();
	}

	@RequestMapping(value = { "/getTopicById" }, method = RequestMethod.GET)
	public Topic getTopicById(long idTopic) {
		return topicService.getTopicById(idTopic);
	}

	@RequestMapping(value = { "/deleteTopic" }, method = RequestMethod.DELETE)
	public boolean deleteTopic(Topic topic) {
		return topicService.deleteTopic(topic);

	}
	@RequestMapping(value = { "/updateTopic" }, method = RequestMethod.POST)
	public Topic updateTopic(Topic topic){
		return topicService.updateTopic(topic);
	}

	@RequestMapping(value = { "/getAllTopics" }, method = RequestMethod.GET)
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

}
