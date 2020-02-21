package net.itinajero.app.service;

import java.util.List;

import net.itinajero.app.model.Filme;

public interface IFilmesService {
	List<Filme> buscarTodas();
	Filme buscarPorId(int idFilme);
}
