import java.util.Scanner;
public class ternario {
    
    public static void main(String[] args){

        // Recebe informações do teclado
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira sua nota: ");
        // nextInt diz que as informações serão números inteiros
        int nota = scan.nextInt();
        // Caso a condição seja atendida, imprime a primeira opção. Do contrário, imprime a segunda
        System.out.println(nota>= 7 ? "Aprovado" : "Reprovado");
    }
}
