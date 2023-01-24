import java.util.Arrays;

public class arrays {
    
   
    public static void main(String[] args){

        String[] carros = new String[] {"Fox","Golf","Onix","Uno","Cruze"};
        int[] numeros = {1,3,5,2,4,6,9,0,7};
        
         for(String modelo:carros){

                System.out.println(modelo);
         }

         
        Arrays.sort(numeros);

        for (int n:numeros){

            System.out.printf("%d - ",n);
        }


    }
}
