package br.com.stefanini.orientacaoaobjetos.executor;
import br.com.stefanini.orientacaoaobjetos.BMW;
import br.com.stefanini.orientacaoaobjetos.Carros;

public class executor {

		public static void main(String[] args) {
			
			Carros carro1 = new Carros();
			
			carro1.setMarca("BMW");
			carro1.setBanco(5);
			carro1.setChassi(9999);
			carro1.setModelo("320i");
			carro1.setPlaca("XXX9999");
			carro1.setRoda(21);
			carro1.setVelocidade(280);
			
			System.out.println(carro1.getMarca());
			System.out.println(carro1.getBanco());
			System.out.println(carro1.getChassi());
			System.out.println(carro1.getModelo());
			System.out.println(carro1.getPlaca());
			System.out.println(carro1.getRoda());
			System.out.println(carro1.acelerar());
			
			Carros carro2 = new Carros("Mercedes");
			System.out.println(carro2.getMarca());
			
			BMW bmw = new BMW ();
			bmw.setVelocidade(100);
			System.out.println(bmw.acelerar());
			
			
			
			
		}
}
