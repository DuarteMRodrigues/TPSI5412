package model;

public class Reserva {
	private int id;
	private String data;
	private String prato;
	private Cliente cliente;
	private Restaurante restaurante;

	public Reserva(int id,  String data, String prato, Cliente cliente, Restaurante restaurante) {
		super();
		this.id = id;
		this.data = data;
		this.prato = prato;
		this.cliente = cliente;
		this.restaurante = restaurante;
	}
	public Reserva(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getPrato() {
		return prato;
	}
	public void setPrato(String prato) {
		this.prato = prato;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Restaurante getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
}
