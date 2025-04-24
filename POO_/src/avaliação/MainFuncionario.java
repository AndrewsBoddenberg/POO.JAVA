package avaliação;

import java.util.Scanner;

public class MainFuncionario {

    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome ");
        funcionario.setNome(sc.next());

        System.out.println("Digite o número da sua matrícula ");
        funcionario.setMatricula(sc.nextInt());

        System.out.println("Digite seu salário ");
        funcionario.setSalario(sc.nextFloat());

        Funcionario funcionario2 = new Funcionario();

        System.out.println("Digite o nome ");
        funcionario2.setNome(sc.next());

        System.out.println("Digite o número da matrícula ");
        funcionario2.setMatricula(sc.nextInt());

        System.out.println("Digite seu salário ");
        funcionario2.setSalario(sc.nextFloat());

        System.out.println(funcionario.toString());
        System.out.println(funcionario2.toString());

    }

}