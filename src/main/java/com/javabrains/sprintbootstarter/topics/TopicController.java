package com.javabrains.sprintbootstarter.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

  @Autowired
  private TopicService topicService;

  @RequestMapping("/topics")
  public List<Topic> getAllTopics() {
    return topicService.getAllTopics();
  }

  @RequestMapping("/topics/{id}")
  public Topic getAllTopics(@PathVariable String id) {
    return topicService.getSingleTopic(id);
  }

}
