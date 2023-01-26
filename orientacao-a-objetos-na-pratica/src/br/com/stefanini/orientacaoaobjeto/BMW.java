package br.com.stefanini.orientacaoaobjeto;

public class BMW extends Carro {

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal,double tempoFinal) {
		System.out.println("BMW Sobrescrita");
		return (velocidadeFinal / tempoFinal)*3.6 ;
	}
}