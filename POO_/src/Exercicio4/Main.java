package Exercicio4;

import java.util.Scanner;

public class Main {


    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do ALuno ");
        aluno.setNome(sc.next());

        System.out.println("Digite o número da matrícula ");
        aluno.setMatricula(sc.nextInt());

        System.out.println("Digite a nota do aluno ");
        aluno.setNotaFinal(sc.nextDouble());

        System.out.println(aluno.toString());

    }
}
