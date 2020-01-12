package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class DemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String hello() {
    return "<html><p>hello world!</p><br><input type=text name='name'><input type=submit></html>";
  }
  
  @RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public ModelAndView getEmployeeInfo() {
		return new ModelAndView("getEmployees");
	}
}
