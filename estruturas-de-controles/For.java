public class For {
    
    public static void main(String [] args){

        // normal
    for (int i = 0; i < 5; i++ ){
        System.out.println(i);
    }

    for (int i = 0, j = 5; i < 5; i++, j-- ){
        System.out.println("i: " + i);
        System.out.println("j: " +j);
    }
        // apenas com condição

        int i = 0;

        for (;i < 5; i++){
            System.out.println(i);
        }

        // loop infinito
          for (;;){
             System.out.println("Loop Infinito");
          }
}
}
