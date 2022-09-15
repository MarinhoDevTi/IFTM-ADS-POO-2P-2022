import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        
        //declaração vairavel de leitura
        Scanner ltr = new Scanner(System.in);

        //declaração de variavel
        int idade = 0;
        int cont = 0;
        double soma = 0, media = 0;

        System.out.println("+===============================+");


        while (idade >= 0){
            System.out.printf("Digite a ");
            System.out.printf(cont + "ª idade: ");
            idade = ltr.nextInt();
            //System.out.println("+===============================+");

            if (idade < 0){
                System.out.println("Impossível Calcular !");  
                System.out.println("+===============================+");          
            } else {
                soma += idade;
                cont ++;
            }
            
        }
        media = soma / cont;
        System.out.printf("Média das Idades %.2f%n: ", media);
        System.out.println("+===============================+");

    }
    
}
