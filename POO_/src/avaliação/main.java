package avaliação;

import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){

        Clinica clinica = new Clinica();

        System.out.println("Digite o nome ");
        clinica.setNome(sc.next());

        System.out.println("Digite o CPF ");
        clinica.setCpf(sc.nextFloat());

        System.out.println("Digite seu e-mail ");
        clinica.setEmail(sc.next());

        Clinica clinica2 = new Clinica();

        System.out.println("Digite o nome ");
        clinica2.setNome(sc.next());

        System.out.println("Digite o CPF ");
        clinica2.setCpf(sc.nextFloat());

        System.out.println("Digite seu e-mail ");
        clinica2.setEmail(sc.next());

        Clinica clinica3 = new Clinica();

        System.out.println("Digite o nome ");
        clinica3.setNome(sc.next());

        System.out.println("Digite o CPF ");
        clinica3.setCpf(sc.nextFloat());

        System.out.println("Digite seu e-mail ");
        clinica3.setEmail(sc.next());

        Clinica clinica4 = new Clinica();

        System.out.println("Digite o nome ");
        clinica4.setNome(sc.next());

        System.out.println("Digite o CPF ");
        clinica4.setCpf(sc.nextFloat());

        System.out.println("Digite seu e-mail ");
        clinica4.setEmail(sc.next());

        System.out.println(clinica.toString());
        System.out.println(clinica2.toString());
        System.out.println(clinica3.toString());
        System.out.println(clinica4.toString());

    }

}
