package br.com.stefanini.orientacaoaobjeto;

public class Principal {

		public static void main(String[] args) {
			Carro bmw = new Carro();
			
			bmw.setMarca("BMW");
			bmw.setModelo("M3");
			bmw.setQuilometroPorLitro(7.5);
			bmw.setTaxaAceleracao(50);
			bmw.setVelocidadeMaxima(280);
			
			Carro mercedes = new Carro("Mercedes","320i");
			
			System.out.println(mercedes.getMarca());
			
			BMW bmwDois = new BMW();
			Tesla tesla = new Tesla();
			tesla.isDirigeSozinho();
			
			Carro teslaDois = new Tesla();
			((Tesla) teslaDois).setDirigeSozinho(true);
			System.out.println(((Tesla) teslaDois).isDirigeSozinho());
			
			
			Carro[] carros = new Carro[] {bmw, bmwDois, tesla, teslaDois};
			
			for (Carro carro : carros) {
				if (carro instanceof Tesla) {
					System.out.println(((Tesla) teslaDois).isDirigeSozinho());
				}
			}
			
			
			bmwDois.calcularTaxaAceleracao(100.5, 10);
			tesla.calcularTaxaAceleracao(100.5, 10);
			
			System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
			
			System.out.println(bmw.getMarca());
			System.out.println(bmw.getModelo());
			System.out.println(bmw.getQuilometroPorLitro());
			System.out.println(bmw.getTaxaAceleracao());
			System.out.println(bmw.getVelocidadeMaxima());
			
			bmw.acelerar();
			bmw.frear();
			
			System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0) + " km/h");
			
			System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5) + " km/h");
		
			}
		}
		
		

