package net.itinajero.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.itinajero.app.model.Filme;
import net.itinajero.app.service.IFilmesService;
import net.itinajero.app.util.Util;

@Controller
public class HomeController {

	@Autowired
	private IFilmesService serviceFilme;
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String buscar(@RequestParam("dataFilme") String datas, Model model) {
		System.out.println("Buscando os filmes na data: "+datas);
		List<String> listaDatas = Util.getNextDays(4);
		List<Filme> filmes = serviceFilme.buscarTodas();
		
		model.addAttribute("dataFilme", datas);
		model.addAttribute("filmes", filmes);
		model.addAttribute("listaDatas", listaDatas);
		
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		List<String> listaDatas = Util.getNextDays(4);
		//System.out.print(listaDatas);
		List<Filme> filmes = serviceFilme.buscarTodas();
			
		/*
		filmes.add("Corinthians");
		filmes.add("Velozes e furiosos");
		filmes.add("Senhor dos anéis");
 		*/
		model.addAttribute("dataFilme", dateFormat.format(new Date()));
		model.addAttribute("filmes", filmes);
		model.addAttribute("listaDatas", listaDatas);
		
		return "home";
	}
	
	//@RequestMapping(value="/detail/{id}/{dataFilme}", method=RequestMethod.GET)
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	//public String mostrarDetalhe(Model model, @PathVariable("id") int idFilme, @PathVariable("dataFilme") String dataFilme){
	public String mostrarDetalhe(Model model, @RequestParam("idFilme") int idFilme, @RequestParam("dataFilme") String dataFilme){
		
		System.out.println("idFilme: "+idFilme);
		System.out.println("dataFilme: "+dataFilme);
		model.addAttribute("filme", serviceFilme.buscarPorId(idFilme));
		// TODO - Buscar os horários no banco de dados   
		
		/*
		String movieTitle = "Velozes e furiosos";
		int duration = 136;
		double ticketPrice = 50;
		
		model.addAttribute("titulo", movieTitle);
		model.addAttribute("duracao", duration);
		model.addAttribute("preco", ticketPrice);
		*/
		return "detalhe";
	}
	
}
