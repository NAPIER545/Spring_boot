package com.example.demo.Name;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class Name {
	@GetMapping("/Name")
	public String name(String Fname,String Lname)
	{
		return Fname+" "+Lname;
	}

}