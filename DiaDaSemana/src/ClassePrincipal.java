import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        
        //variavel de entrada
        Scanner sc = new Scanner(System.in);

        //declaração de variaveis
        int dia = sc.nextInt();
        String msg = "";

        System.out.println("Digite ");
        //casos de uso 
        switch (dia) {
            case 1:
                msg = "Domingo";                
                break;
            case 2:
                msg = "Segunda - feira";                
                break;
            case 3:
                msg = "Terça - Feira";
                break;
            case 4:
                msg = "Quarta - Feira";
                break;
            case 5:
                msg = "Quinta - Feira";
                break;
            case 6:
                msg = "Sexta - Feira";
                break;
            case 7:
                msg = "sábado";
                break;        
            default:
                System.out.println("Valor Inválido !!!");
                break;
        }
        System.out.println("O dia é: " + msg);

        
    }
    
}
