package com.example.demo.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/api")
public class GreetingController {

	@GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getGretings() throws Exception {
		return "Comming soon";
	}
}
