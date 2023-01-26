package br.com.stefanini.orientacaoaobjetos;

public class Mercedes extends Carros {

		public Mercedes() {
			this.setMarca("Mercedes");
		}
		
		@Override
		public String acelerar() {
			return "A mercedes tem uma aceleração diferene para cada modelo"; 
		}
}
