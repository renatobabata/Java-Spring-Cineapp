package net.itinajero.app.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.itinajero.app.model.Filme;

@Service
public class FilmesServiceImp implements IFilmesService {

	private	List<Filme> lista = null;

	public FilmesServiceImp(){
		System.out.println("Criando uma instância da classe FilmeServiceImp");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
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
			
		} catch(ParseException e){
			System.out.println("Error: "+ e.getMessage());
		}
	}
	
	@Override
	public List<Filme> buscarTodas() {
		return lista;
	}

}
