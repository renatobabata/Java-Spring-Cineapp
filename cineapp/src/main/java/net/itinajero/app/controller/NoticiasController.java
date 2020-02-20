package net.itinajero.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.itinajero.app.model.Noticia;

@Controller
@RequestMapping("/noticias" )
public class NoticiasController {

	@GetMapping(value ="/create")
	public String crear() {
		return "noticias/formNoticias";
	}
	
	@PostMapping(value ="/save")
	public String guardar(@RequestParam("titulo") String titulo, @RequestParam("status") String status, @RequestParam("detalhe") String detalhe) {
		
		Noticia noticia = new Noticia();
		
		noticia.setTitulo(titulo);
		noticia.setStatus(status);
		noticia.setDetalhe(detalhe);
		
		System.out.println(noticia);
		return "noticias/formNoticias";
	}
}
