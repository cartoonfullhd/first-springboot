package com.example.springboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService
	{
		public String retrieveWelcomeMessage()
		{
			return "Welcome Service";
		}
	}