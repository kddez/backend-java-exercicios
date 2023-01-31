package br.com.stefanini.estruturacontrole;

public class ifElse {

	
	
		public static void main(String[] args) {
				
			int idade = 16;
			
			if (idade >= 18) {
				System.out.println("Maior de idade");
			}else {
				System.out.println("Menor de idade");
			}
			
			
			if (idade>= 100) {
				System.out.println("Virou múmia");;
				
			}else if (idade>=18) {
				System.out.println("Maior de idade");
			}else  {
				System.out.println("Menor de idade");
			}
		}
}
