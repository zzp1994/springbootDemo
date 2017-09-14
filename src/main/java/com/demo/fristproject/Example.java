package com.demo.fristproject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class Example {
	
	@RequestMapping("/")
	public String home(){
		return "hello world";
	}
	
	
	@RequestMapping("/hello/{myName}")
	public String home(@PathVariable String myName){
		return "hello   "+myName+"!!!";
	}

}
