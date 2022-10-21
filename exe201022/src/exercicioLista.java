import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class exercicioLista {

    public static void main(String[] args) {
        
        List<Funcionario> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //1 - Leitura de dados 
        System.out.println("Quanto empregado você deseja registrar?");
        int n = sc.nextInt();

        for (int i = 0; i < args.length; i++) {
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("nome: ");
            String nome = sc.nextLine();
            double salario = sc.nextDouble();
            //lista.add(new.Funcionario(id, nome, salario));
            Funcionario f = new Funcionario(id, nome, salario);
            lista.add(f);
            
        }

        //2 - Realizando o aumento de salario, caso o funcionario exista 
        System.out.println();
        System.out.println("Digite o id do funcionario que se deseja aumentar o salario: ");
        int id = sc.nextInt();

        boolean existeIdNaLista = false;

        for (Funcionario funcionario : lista) {
            if (funcionario.getId() == id){
                System.out.println("Digite a porcentagem do aumento: ");
                double porcentagem = sc.nextDouble();
                funcionario.aumentarSalario(porcentagem);
                existeIdNaLista = true;
            }
            
        }
        if(existeIdNaLista == false){
            System.out.println("id inexistemte !!!");
        }

        //3 - Imprimir a lista 

        System.out.println();
        System.out.println("Lista de Empregados");
        for (Funcionario obj : lista) {
            System.out.println(obj);

        }

    }
    
}
