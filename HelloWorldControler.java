package com.helloworld.helloworld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldControler {
	
	@GetMapping
	public String helloWorld() {
		return "<br> <li>Hello World!<br>";
		
	}

}
