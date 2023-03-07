public class BreakContinue {
    
    public static void main(String[] args){

        String[] carros = new String[] {"BMW i320", "Golf", "Jetta", "Mercedes AMG"};

        for (int i = 0; i < carros.length; i++){
            if (carros[i] == "Golf"){
                System.out.println(carros[i]);
                break;
            }

            System.out.println(carros[i]);
        }

        for (int i = 0; i < carros.length; i++){
            if (carros[i] == "Golf"){
                System.out.println(carros[i]);
                continue;
            }

            System.out.println("quero esse carro");
            System.out.println(carros[i]);
        }
    }
    
}
