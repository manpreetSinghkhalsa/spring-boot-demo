package com.javabrains.sprintbootstarter.topics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
  private List<Topic> topics = Arrays.asList(
      new Topic("id-1", "name-1", "description-1"),
      new Topic("id-2", "name-2", "description-2"),
      new Topic("id-3", "name-3", "description-3"),
      new Topic("id-4", "name-4", "description-4"),
      new Topic("id-5", "name-5", "description-5")
  );

  public List<Topic> getAllTopics() {
    return topics;
  }

  public Topic getSingleTopic(String id) {
    for (int i = 0; i < topics.size(); i++) {
      if (id.equalsIgnoreCase(topics.get(i).getId())) {
        return topics.get(i);
      }
    }
    return null;
  }
}
