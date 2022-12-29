package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserControler {

	@GetMapping
	public Principal user(Principal user) {
		return user;
	}
	
	@PostMapping
	public Principal user2(Principal user) {
		return user;
	}

}