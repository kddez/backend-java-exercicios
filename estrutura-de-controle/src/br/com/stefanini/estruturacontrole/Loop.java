package br.com.stefanini.estruturacontrole;

public class Loop {

		public static void main(String [] args) {
			
			
			int count = 10;
			
			while (count < 100) {
				System.out.println("count: " + count);
				count++;
			}
			
			int countDois = 10;
			
			do{
				System.out.println(countDois);
				countDois++;
			}while  (countDois < 100);
			
			for (int i = 0; i < 100; i++ ) {
				System.out.println("for: " + i);
			}
			
			int i = 0;
			
			for (; i < 100;) {
				System.out.println("for ausente: " + i);
				i++;
			}
			
			for (;;) {
				System.out.println("for");
			}
		}
}
