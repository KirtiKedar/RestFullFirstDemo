package com.example.RestFullFirstDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class WelcomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomeMsg() {
		String msg = "Welcome to BikkadIT";
		return msg;
	}

	@GetMapping("/welcome1")
	public String welcomeMsg1() {
		String msg = "Welcome to BikkadIT Pune";
		return msg;

	}
}

