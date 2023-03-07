package br.com.stefanini.orientacaoaobjeto;

public class Tesla extends Carro {

		private boolean dirigeSozinho;
		
		public boolean isDirigeSozinho() {
			return dirigeSozinho;
		}
		
		public void setDirigeSozinho(boolean dirigeSozinho) {
			
			this.dirigeSozinho = dirigeSozinho;
		}
		
		@Override
		public double calcularTaxaAceleracao(double velocidadeFinal,double tempoFinal) {
			System.out.println( "Tesla Sobrescrita");
			return (velocidadeFinal / tempoFinal)*3.6 ;
		}

		@Override
		public void piscarAlerta() {
			System.out.println("Tesla piscando alerta...");
		}
}