package br.com.springmvc.thymeleaf.model;



public class Multa {

	private Long id;
	private String titulo;
	private int valor;
	private String morador;
	private String apto;
	
	
	
	public Multa(Long id, String titulo, int valor, String morador, String apto) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.valor = valor;
		this.morador = morador;
		this.apto = apto;
	}

	public Multa() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getMorador() {
		return morador;
	}

	public void setMorador(String morador) {
		this.morador = morador;
	}

	public String getApto() {
		return apto;
	}

	public void setApto(String apto) {
		this.apto = apto;
	}

	@Override
	public String toString() {
		return "Multa \n id: " + id + "\n titulo=" + titulo + "\n valor=" + valor + 
				"\n morador=" + morador + "\n apto=" + apto;
	}
	
	
}
