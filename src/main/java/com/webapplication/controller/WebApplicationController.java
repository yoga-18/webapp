package com.webapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplicationController {
	
	@GetMapping("/get1")
	public String getall() {
		return "Web Application running.....";
	}
	

}

