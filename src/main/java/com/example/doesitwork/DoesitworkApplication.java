package com.example.doesitwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
                       
@SpringBootApplication
@RestController
@RequestMapping(path="/")
public class DoesitworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoesitworkApplication.class, args);

		
	}
	@GetMapping
	public String hello(){
		return "HOMEPAGe";
	}
	
}
