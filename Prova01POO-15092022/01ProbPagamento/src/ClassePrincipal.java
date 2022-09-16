import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        //variavel para leitura 
        Scanner ltr = new Scanner(System.in);

        //declaração de variaveis
        String nome;
        double vHora;
        double hTrabalhadas;
        double pag;


        System.out.println("==================================");
        System.out.println("=-=-=-=-= Pagamento -=-=-=-=-=-=");

        // Leitura de dados 
        System.out.println("Digite o nome do funcionario : ");
        nome = ltr.nextLine();
        System.out.println("==================================");

        System.out.println("Qual o valor da hora ? ");
        vHora = ltr.nextDouble();
        System.out.println("==================================");

        System.out.println("Horas Trabalhadas: ");
        hTrabalhadas = ltr.nextDouble();

        //processamento de dados
        pag = vHora * hTrabalhadas;
        
        //Saida de dados
        System.out.println("O pagamente de " + nome +" deve ser R$ " + pag );
        ltr.close();

    }
    
}
