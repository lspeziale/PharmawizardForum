package com.pharmawizard.service;

import java.util.List;
import com.pharmawizard.domain.Topic;

public interface TopicService {

	Topic getTopicById(Long idTopic);
	
	boolean deleteTopic(Topic topic);
	
	Topic updateTopic(Topic topic);

	List<Topic> getAllTopics();

}
