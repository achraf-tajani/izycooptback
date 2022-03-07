package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AngularRedirectionController {

	// Redirection pour que le HTML 5 mode fonctionne (par opposition au hashtag routing).
	@GetMapping({ "/","home"})
	public String home() {
		return "forward:/index.html";
	}
}
