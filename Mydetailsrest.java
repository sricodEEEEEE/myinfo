package com.example.Mydetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Mydetailsrest {

	@Autowired
	Mydetailsservice service;
	
	@GetMapping("/")
	public Mydetailsservice dev() {
		return new  Mydetailsservice("Manjunath",425409,"2020","web development", "Axioms","Hyderabad","8074533967");
	}
}
