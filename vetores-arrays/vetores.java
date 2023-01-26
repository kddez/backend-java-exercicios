import java.util.Scanner;
public class vetores {
    
    public static void main(String []args){

        // Array simples
         int[] num= new int[5];

                                    // Inicializando os valores
         num[0] = 5;
         num[1] = 10;
         num[2] = 52;
         num[3] = 500;
         num[4] = 511;

         System.out.println(num[4]);


                                    // Estrutura que possibilita armazenar informações do teclado
         Scanner scan = new Scanner (System.in);
        final int tam = 5;
        int nota = 0;
        char[] gabarito = {'a','b','c','a','b'};

        char[] respostas = new char[tam];

                                    // Estrutura que repete até que todas as respostas tenham sido preenchidas
        for (int i=0; i<tam;i++){
            System.out.printf("Informe sua resposta %d: ", i);
            respostas[i] = scan.nextLine().charAt(0);

        } 

                                     // Estrutura que compara as alternativas selecionadas com o gabarito
        for (int i=0; i<tam;i++){
            if (respostas[i]==gabarito[i]){
                nota++;
            }
        }

        System.out.printf("Sua nota foi: %d ", nota);

    }
}
