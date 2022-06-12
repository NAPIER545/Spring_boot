package com.example.demo.Test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Test {
	
	@GetMapping("/Test")
	public int test(char x,int a,int b)
	{
		if(x=='+')
		{
		  return a+b;
		}
		else if(x=='-')
		{
			return a-b;
		}
		else if(x=='*')
		{
			return a*b;
		}
		else if (x=='/')
		{
			return a/b;
		}
		else
		{
			return x;
		}
		
		
}
}

