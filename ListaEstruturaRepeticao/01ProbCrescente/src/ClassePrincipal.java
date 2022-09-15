import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        /* 
         * 1. Problema “crescente”

        Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para
        cada X e Y uma mensagem que indique se estes valores foram digitados em ordem
        crescente ou decrescente. O programa deve finalizar quando forem digitados dois
        valores iguais.
        */

        //declaração variavel de Leitura
        Scanner ltr = new Scanner(System.in);
            //declaração de variaveis
            int x;
            int y;

            System.out.println("+======================================+");

            //Leitura de valores ...
            System.out.println("Digite os Numeros X e Y:  ");
            x = ltr.nextInt();            
            y = ltr.nextInt();09


        //condição 
        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
                System.out.println("+======================================+");

            } else {
                System.out.println("Crescente");
                System.out.println("+======================================+");
        	    
            } 
            x = ltr.nextInt();
        	y = ltr.nextInt();
        }  
        ltr.close();
        System.out.println("Programa Finalizado !!!");
        System.out.println("+======================================+");   

    }
    

}
