package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "Hello!!";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello!!";
	}
}
