package br.com.stefanini.orientacaoaobjetos;

public class Carros {
	
	private String marca;
	private String modelo;
	private int chassi;
	private String placa;
	private int roda;
	private int banco;
	private int velocidade;
	
	
	public Carros () {
		System.out.println("Construindo um carro");
	}
	
	public Carros (String marca) {
		this.marca = marca;
	}
	
	public String acelerar() {
		return velocidade + "km/5s";
	}
	
	
	
	public int getVelocidade() {
		return velocidade;
	}



	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}



	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getChassi() {
		return chassi;
	}
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getRoda() {
		return roda;
	}
	public void setRoda(int roda) {
		this.roda = roda;
	}
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	
}
