import java.util.Scanner;

public class ClassePrincipal {
    
    public static void main(String[] args) {
        
        //variavel de leitura
        Scanner ltr = new Scanner(System.in);

        //declarações de variaveis
        int caso = -1;
        double num1, num2;  
        
        


        while (caso != 0){
            System.out.println("-=-=-=-=-=- Calculadora -=-=-=-=-=-=");
            System.out.println("Escolha a opção: ");
            System.out.println("1 para Soma");
            System.out.println("2 para Subtração");
            System.out.println("3 para Multiplicação");
            System.out.println("4 para Divisão");
            System.out.println("0 para sair");
            caso = ltr.nextInt();
            

            switch (caso) {
                case 1:

                    System.out.println("Soma");
                    System.out.println("Digite os 2 Numeros");
                    num1 = ltr.nextDouble();
                    num2 = ltr.nextDouble();
                    System.out.println(num1 + num2);

                break;
                case 2:

                    System.out.println("Soma");
                    System.out.println("Digite os 2 Numeros");
                    num1 = ltr.nextDouble();
                    num2 = ltr.nextDouble();
                    System.out.println(num1 - num2);

                break;
                case 3:

                    System.out.println("Soma");
                    System.out.println("Digite os 2 Numeros");
                    num1 = ltr.nextDouble();
                    num2 = ltr.nextDouble();
                    System.out.println(num1 * num2);

                break;
                case 4:

                    System.out.println("Soma");
                    System.out.println("Digite os 2 Numeros");
                    num1 = ltr.nextDouble();
                    num2 = ltr.nextDouble();
                    System.out.println(num1 / num2);

                break;
                case 0:
                    System.out.println("Calculadora Finalizada !");

                break;
            
                default:
                    System.out.println("Digite a opção correta !");

                break;
            }
            

        }
        ltr.close();
    }
}
