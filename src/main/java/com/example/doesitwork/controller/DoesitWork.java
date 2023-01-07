package com.example.doesitwork.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
	public class DoesitWork {

    @GetMapping("/yes")
    public String greeting(){
        return "IT works?";
    }

    @PostMapping("/m")
    public String createMessage(@RequestBody String message) {
        return "Successfully received message: " + message;
    }
    
}
