package net.itinajero.app.model;

import java.util.Date;

public class Noticia {

	private int id;
	private String titulo;
	private Date dataNoticia;
	private String detalhe;
	private String status;
	
	public Noticia() {
		this.dataNoticia = new Date();
		this.status = "Ativo";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataNoticia() {
		return dataNoticia;
	}

	public void setDataNoticia(Date dataNoticia) {
		this.dataNoticia = dataNoticia;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titulo=" + titulo + ", dataNoticia=" + dataNoticia + ", detalhe=" + detalhe
				+ ", status=" + status + "]";
	}
	
	
	
}
