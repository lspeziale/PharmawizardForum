package com.pharmawizard.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pharmawizard.domain.Topic;

@Service
public interface TopicService {

	Topic getTopicById(long idTopic);

	Collection<Topic> getAllTopics();

}
