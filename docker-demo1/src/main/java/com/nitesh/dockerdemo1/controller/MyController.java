package com.nitesh.dockerdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test-mydocker")
	public String getData() {
		return "In Docker Demo1";
	}
	
}
