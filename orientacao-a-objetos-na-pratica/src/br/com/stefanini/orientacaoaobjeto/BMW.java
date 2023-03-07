package br.com.stefanini.orientacaoaobjeto;

public class BMW extends Carro implements Esportivo, Utilitario {

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal,double tempoFinal) {
		System.out.println("BMW Sobrescrita");
		return (velocidadeFinal / tempoFinal)*3.6 ;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("BMW piscando alerta...");
	}

	@Override
	public void passear() {
	}

	@Override
	public void acionarTurbo() {
	}
}