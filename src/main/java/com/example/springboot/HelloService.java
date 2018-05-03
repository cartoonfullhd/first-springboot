package com.example.springboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloService
{
	public String retrieveHelloMessage()
	{
		return "Hello Service";
	}
}
