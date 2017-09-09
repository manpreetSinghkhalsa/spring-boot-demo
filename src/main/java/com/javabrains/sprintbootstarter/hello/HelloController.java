package com.javabrains.sprintbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  // Default is GET rest
  @RequestMapping("/hello")
  public String sayHi() {
    return "Hanziiii";
  }
}
