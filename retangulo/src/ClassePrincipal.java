import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        
        /*Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
    mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas
    decimais, conforme exemplos.*/
        
        //declaração metodo Scanner
        Scanner sc = new Scanner(System.in);

        //declaração de variavies
        double base, altura, area, perimetro, diagonal;

        System.out.println("-=-=-= .:: Altura, Perimetro e Diagonal ::. -=-=-");
        System.out.println("=================================================");

        //leitura de dados ...
        System.out.println("Digite a base do retângulo: ");
        base = sc.nextDouble();
        System.out.println("________________________________________");

        System.out.println("Digite a altura do retângulo:");
        altura = sc.nextDouble();
        System.out.println("________________________________________");

        System.out.println("=================================================");

        //processamento de dados
        area = base * altura;
        perimetro = (base + altura) * 2;
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));


        //saida de dados
        System.out.printf("Área do Retângulo: %.2f\n ", area);
        System.out.println("________________________________________");
        System.out.printf("Perimetro do Retângulo: %.2f\n ", perimetro);
        System.out.println("________________________________________");
        System.out.printf("Diagonal do Retângulo: %.2f\n ", diagonal);
        System.out.println("=================================================");



        


        

        
    }
}
