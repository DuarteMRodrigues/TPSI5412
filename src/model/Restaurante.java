package model;

public class Restaurante {
	private int id;
	private int contacto;
	private String nome;
	private String morada;
	private String especialidade;

	public Restaurante(int id, int contacto, String nome, String morada, String especialidade) {
		super();
		this.id = id;
		this.contacto = contacto;
		this.nome = nome;
		this.morada = morada;
		this.especialidade = especialidade;
	}
	public Restaurante(){
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
