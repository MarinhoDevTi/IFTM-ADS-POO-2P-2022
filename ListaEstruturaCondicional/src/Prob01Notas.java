import java.util.Scanner;

public class Prob01Notas {
    public static void main(String[] args) {
        
        //Declaração de variável de leitura 
        Scanner ltr = new Scanner(System.in);

        //declação de variaveis 
        double notas01, notas02, notafim;

        System.out.println("-=-=-= .:: Lançamento de Notas ::. =-=-=-");
        
        //leitura de dados
        System.out.println("Notas do Primeiro semestre: []");
        notas01 = ltr.nextDouble();

        System.out.println("Notas do Segundo semestre: []");
        notas02 = ltr.nextDouble();

        //processamento e saida de dados
        notafim = notas01 + notas02;

        if (notafim > 60) {
            System.out.println("======================================");
            System.out.printf("Notas totais do Aluno: %.1f%n", notafim);
            System.out.println("======================================");
            System.out.println("Parabéns você foi aprovado");
            System.out.println("======================================");
        } else {
            System.out.println("======================================");
            System.out.printf("Notas totais do Aluno: %.1f%n", notafim);
            System.out.println("======================================");
            System.out.println("Aluno REPROVADO");
            System.out.println("======================================");
        }
        ltr.close();

    }
    
}
