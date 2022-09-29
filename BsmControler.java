package com.helloworld.helloworld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BsmGeneration")
public class BsmControler {
	
	@GetMapping
	public String bsmGeneration() {
		return "<br> <li>Comunicação <br> <li>Proatividade <br> <li>Orientação ao detalhe <br> <li>Trabalho em equipe<br>";
		
		
		
	}

}
