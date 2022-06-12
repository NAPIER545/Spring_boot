package com.example.demo.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class First {
	@GetMapping("/First")
	public String first() {
		return "good morning" ;
	}

}

