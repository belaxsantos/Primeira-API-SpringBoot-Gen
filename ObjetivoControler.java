package com.helloworld.helloworld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ObjetivoApredizagem")
public class ObjetivoControler {
	
	@GetMapping
	public String ObjetivoAprendizagem() {
		return "<br> <li> Conteúdos do projeto integrador em dia <br> <li>Atividades do MySQL entregues <br> <li>Aprender API<br>";
	}

}
