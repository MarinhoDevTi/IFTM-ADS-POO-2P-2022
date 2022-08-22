import java.util.Scanner;

public class Prob02Baskara {
    public static void main(String[] args) {

        //variavel de entrada
        Scanner ltr = new Scanner(System.in);

        //declaração de variaveis
        int a, b, c;
        double x1, x2, delta;

        System.out.println("+====================================+");
        System.out.println("-=-=-=-= .::: Fórmula de Bhaskara :::. =-=-=-=-");

        //leitura de dados 
        System.out.println("Digite os valores de [a] [b] [c]");
        a = ltr.nextInt();
        b = ltr.nextInt();
        c = ltr.nextInt();

        //cálculo ( valor de delta )
        delta = Math.pow(b,2)- 4 * a * c;

        //valores de X' e X"
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        //saida dos valores
        System.out.println("+====================================+");
        System.out.println("Este é o valor de Delta: " + delta);
        System.out.println("+====================================+");
        System.out.println("Este é o valor do X1: " + x1);
        System.out.println("+====================================+");
        System.out.println("Este é o valor do X2 " + x2);
        System.out.println("+====================================+");

        ltr.close();
    }
    

}
