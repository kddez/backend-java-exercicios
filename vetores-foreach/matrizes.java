import java.security.SecureRandom;
public class matrizes {
    
    public static void main(String[] args){


        // Matriz com valores gerados aleatoriamente com SecureRandom
        
        final int linhas =3;
        final int colunas =5;

        int[][] numeros = new int[linhas][colunas];

        for(int l=0; l<linhas ; l++){
            for(int c=0; c<colunas ; c++){

                numeros[l][c] = new SecureRandom().nextInt(100);
                System.out.printf("%2d : ",numeros[l][c]);
            }
                System.out.printf("%n");
        }

        // Matriz com valores já instanciados

       int[][] num = {{10,20,30,40,50},{100,200,300,400,500},{1,2,3,4,5}};

        for(int[] n:num){
            for(int v:n){

                System.out.printf("%3d : ",v);
            }
                System.out.printf("%n");

        }

    }

}
