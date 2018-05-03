package com.example.springboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class WelcomeController 
{
	@Autowired
	private WelcomeService welcome;
	
	@Autowired
	private HelloService hello;
	
	@RequestMapping("/welcome")
	public String welcome() 
	{
		return welcome.retrieveWelcomeMessage();
	}
	
	@RequestMapping("/hello")
	public String hello()
	{
		return hello.retrieveHelloMessage();
	}
}
