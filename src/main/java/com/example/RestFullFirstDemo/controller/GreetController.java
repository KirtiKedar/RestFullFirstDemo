package com.example.RestFullFirstDemo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetController")
public class GreetController {

	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		String msg="Good Evening all";
		int a=10/0;
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@GetMapping("/welcome1")
	public String welcomeMsg1() {
		String msg="Welcome to BikkadIT Pune";
		return msg;
		
	}
}

