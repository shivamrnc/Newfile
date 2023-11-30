package com.example.docker.docker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Hello {
	@GetMapping("/Shivam")
	public String Hello() 
	{return "Welcome";}

}
