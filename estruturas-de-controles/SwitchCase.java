public class SwitchCase {
    
    public static void main(String []args){

        int dia = 2;

        switch (dia){
            case 1: System.out.println("Segunda-Feira");
            break;
            case 2: System.out.println("Terça-Feira");
            break;
            case 3: System.out.println("Quarta-Feira");
            break;
            case 4: System.out.println("Quinta-feira");
            break;
            case 5: System.out.println("Sexta-feira");
            break;
            case 6: System.out.println("Sábado");
            break;
            case 7: System.out.println("Domingo");
            break;
            default: System.out.println("Dia inválido");
        }
    }
}
