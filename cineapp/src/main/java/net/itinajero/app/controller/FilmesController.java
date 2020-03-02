package net.itinajero.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.itinajero.app.model.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmesController {

	@GetMapping("/create")
	public String criar() {
		return "filmes/formFilme";
		
	}
	
	@PostMapping("/save")
	public String guardar(Filme filme, BindingResult result) {
		
		/*
		if(result.hasErrors()) {
			System.out.println("Existiram erros");
			return"filmes/formFilme";
		}
		*/
		for(ObjectError error: result.getAllErrors()) {
			System.out.println("Mensagem de erro: "+error.getDefaultMessage());
		}
		
		System.out.println("Guardar filmes "+filme);
		return "filmes/formFilme";
	}
}
