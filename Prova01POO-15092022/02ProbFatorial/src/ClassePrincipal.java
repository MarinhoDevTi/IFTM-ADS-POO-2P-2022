
import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        
        //declaração da variavel de leitura
        Scanner ltr = new Scanner(System.in);

        //declaração de variaveis 
        int num = 0;
        int fat = 1;
        int cont = 0;

        //inicio
        System.out.println("-=-=-=-=-= Fatorial -=-=-=-=-=-=");
        System.out.println("=================================");


        //leitura
        System.out.println("Digite o numero do faturial: ");
        fat = ltr.nextInt();
        cont = fat;
        //processamento de dados
        while (cont > 0){
    
            fat *= cont;

            cont -= 1;

        /*num = fat;
        while (num > 0) {
            
            fat = fat * (fat - 1);
            num = num - num; 
            

            
        }*/
                 
        }
        System.out.println("Este é o valor do Fatorial: " + fat);
        ltr.close();
    }
}
