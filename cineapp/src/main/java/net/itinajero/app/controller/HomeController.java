package net.itinajero.app.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		List<String> filmes = new LinkedList<>();
		filmes.add("Corinthians");
		filmes.add("Velozes e furiosos");
		filmes.add("Senhor dos anéis");
		model.addAttribute("filmes", filmes);
		
		return "home";
	}
	
	@RequestMapping(value="/detail")
	public String mostrarDetalhe(Model model) {
		String movieTitle = "Velozes e furiosos";
		int duration = 136;
		double ticketPrice = 50;
		
		model.addAttribute("titulo", movieTitle);
		model.addAttribute("duracao", duration);
		model.addAttribute("preco", ticketPrice);
		return "detalhe";
	}
	
}
