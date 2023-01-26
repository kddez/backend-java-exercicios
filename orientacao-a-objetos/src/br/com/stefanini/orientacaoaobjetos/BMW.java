package br.com.stefanini.orientacaoaobjetos;

public class BMW extends Carros {

		public BMW () {
			
			this.setMarca("BMW");
		}
		
		@Override
		public String acelerar() {
			return "A BMW pode fazer de 0 a " + this.getVelocidade() + " em 5s"; 
		}
}
