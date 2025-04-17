package exercicio1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome ");
        pessoa.setNome(sc.next());

        System.out.println("Digite sua idade ");
        pessoa.setIdade(sc.nextInt());

        System.out.println(pessoa.toString());
    }
}
