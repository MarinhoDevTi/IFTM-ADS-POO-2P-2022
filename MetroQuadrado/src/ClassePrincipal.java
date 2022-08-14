import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        //variavel scanner
        Scanner sc = new Scanner(System.in);



        //declaração de variaveis ...
        double largTer;
        double compriTer;
        double varMet;
        double met2;
        double precTot;


        //inicio do programa...
        System.out.println("-=-=-=-=-= .:: Calculo de metros quadrados ::. -=-=-=-=-=-");
        System.out.println("-----------------------------------------------------------");

        //leitura de dados ...
        System.out.println("Digite a largura do terreno: ");
        largTer = sc.nextDouble();
        System.out.println("------------------------------");

        System.out.println("Digite o comprimento do trerreno: ");
        compriTer = sc.nextDouble();
        System.out.println("------------------------------");
        

        System.out.println("Digite o valor do metro quadrado: ");
        varMet = sc.nextDouble();
        System.out.println("------------------------------");

        //processamento de dados
        met2 = largTer * compriTer;
        precTot = met2 * varMet; 



        //saida de dados ...
        System.out.printf("Valor total do metro quadrado: %.2f\n ", "[", precTot, "]");
        System.out.println("------------------------------");
                
    }
    
}
