package inicioJava;

import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double num1, num2;
        int tipocalculo;

        System.out.println("Bem vindo ao programa calculadora!");
        System.out.println("Escreva o primeiro valor:");
        num1 = sc.nextDouble();
        System.out.println("Escreve o segundo valor");
        num2 = sc.nextDouble();
        System.out.println("Escreve o tipo de calculo");
        System.out.println("1 - Adição");
        System.out.println("2 - subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha: ");

        tipocalculo = opcaocalculo();

        if (tipocalculo == 1) {
            System.out.println("Oresultado é: " + (num1 + num2));

        } else if (tipocalculo == 2) {
            System.out.println("O resultado é: " + (num1 - num2));

        } else if (tipocalculo == 3) {
            System.out.println("O resultado é " + (num1 * num2));

        } else if (tipocalculo == 4) {
            System.out.println("O resultado é: " + (num1 / num2));

        }else {
            System.out.println("Valor incorreto ");
        }
    }

    public static int opcaocalculo(){
        System.out.println("Escreve o tipo de calculo");
        System.out.println("1 - Adição");
        System.out.println("2 - subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha: ");

    int tipocalculo = sc.nextInt();
    return tipocalculo;

    }

}
    
