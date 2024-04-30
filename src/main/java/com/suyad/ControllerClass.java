package com.suyad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suyad.Entity.Student;

@RestController
public class ControllerClass
{
	
	@Autowired
	Student s;
	
	@GetMapping("/greet")
	public String getName()
	{
		s.setName("Suyadpreet Singh");
		return "Name = "+s.getName();
	}
}
