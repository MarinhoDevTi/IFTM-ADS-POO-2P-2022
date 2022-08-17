import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        Scanner schr = new Scanner(System.in);

        int horas;

        System.out.println("-=-=-=-=-= .::: Horário do dia :::. -=-=-=-=-=");
        System.out.println("==============================================");
        
        //leitura de dados... 
        System.out.println("Digite o horario do dia: ");
        horas = schr.nextInt();

        //tratamento de condições...
        if (horas < 12){
            System.out.println("Bom dia");
            System.out.println("______________________________________________");
        } else if (horas >= 12 && horas < 18){
            System.out.println("Boa tarde");
            System.out.println("______________________________________________");
        } else if (horas >= 18 && horas < 24) {
            System.out.println("Boa noite");;
            System.out.println("______________________________________________");

        } else {
            System.out.println("Valor inválido");
            System.out.println("______________________________________________");
        }       
        System.out.println("==================================================");     
        schr.close();
    }
    
}
