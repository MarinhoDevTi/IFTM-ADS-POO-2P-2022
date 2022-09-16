import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        
        //variavel de leitura
        Scanner ltr = new Scanner(System.in);

        //declaração de variaveis
        double glicose;


        System.out.println("-=-=-=-=-=- Nivel de Glicose -=-=-=-=-=");
        System.out.println("Qual a quantidade de Glicose no Sangue ?");
        glicose = ltr.nextDouble();

        if (glicose <= 100){
            System.out.println("Nível de glicose Normal");
        } else if (glicose > 100 && glicose <= 140) {
            System.out.println("Nível de glisose Elevado");
        } else if (glicose > 140 )
            System.out.println("O paciente esta com diabete");
        ltr.close();  
    }
    
}
