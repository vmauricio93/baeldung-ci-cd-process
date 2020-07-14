package com.spring.cicd.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
  @GetMapping(value="/")
  public String getIndex() {
      return "<h1>HOLA</h1>";
  }
  

}