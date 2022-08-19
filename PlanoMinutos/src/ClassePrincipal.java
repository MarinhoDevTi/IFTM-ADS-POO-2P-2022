import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        
        //variável de leitura...
        Scanner sc = new Scanner(System.in);

        //declaração de variaveis
        double minutos, valor, valori = 50.0, taxam = 15.0;

        System.out.println("=-=-=-=- .::: Calcula Plano de telefonia :::. =-=-=-=-");
        System.out.println("======================================================");


        //leitura de dados
        System.out.println("Minutos gastos do cliente: ");
        minutos = sc.nextDouble();

        //tratamento de condições 
        if (minutos <= 0) {

            System.out.println("cliente gastou quantidade mínima: R$ " + taxam);
            
        } else if (minutos <= 100){

            valor = valori;
            System.out.println("Este é o valor da fatura: R$ " + valor);        

        } else {

            valor = valori + (minutos - 100)  * 2;
            System.out.println("Este é o valor da fatura: R$ " + valor);
        } 
        sc.close();

    }
    //
    //
    //
    
}
