package net.itinajero.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.itinajero.app.model.Filme;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		List<Filme> filmes = getLista();
			
		/*
		filmes.add("Corinthians");
		filmes.add("Velozes e furiosos");
		filmes.add("Senhor dos anéis");
 		*/
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
	
	private List<Filme> getLista(){
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Filme> lista = null;
		try {
			lista = new LinkedList<>();
			
			Filme filme1 = new Filme();
			filme1.setId(1);
			filme1.setTitulo("Power Rangers");
			filme1.setDuracao(120);
			filme1.setClassificacao("8");
			filme1.setGenero("Aventura");
			filme1.setDataLancamento(formatter.parse("02-05-2017"));
			filme1.setImagem("stars.jpg");
			filme1.setStatus("ativo");
		
			Filme filme2 = new Filme();
			filme2.setId(2);
			filme2.setTitulo("Corinthians");
			filme2.setDuracao(1910);
			filme2.setClassificacao("10");
			filme2.setGenero("Emoção");
			filme2.setDataLancamento(formatter.parse("19-10-1910"));
			filme2.setImagem("corinthians.png");
			filme2.setStatus("inativo");
			
			lista.add(filme1);
			lista.add(filme2);
			
			return lista;
		} catch(ParseException e){
			System.out.println("Error: "+ e.getMessage());
			return null;
		}
	}
}
