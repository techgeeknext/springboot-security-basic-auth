package com.techgeeknext.basicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(required = false,defaultValue = "TechGeekNext User") String name) {
		return "Hello "+name;
	}
}
