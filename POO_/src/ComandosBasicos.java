import java.util.Scanner;

public class ComandosBasicos {
    static Scanner sc = new Scanner (System.in); //prompt - scaner serve para receber a mensagem
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Java");

        //Variaveis de tipos primitivos
        boolean TrueOrFalse = true;
        int numerosreais = 0; // 10000000 a -100000000
        double decimais = 0.2; // 10000.200 a -10000.400
        char letra = 'A';

        //Variavel tipo objeto
        String texto = "Testo";
        Integer numerosReais2 = 2; //Inteiro do tipo objeto
        Double decimais2 = 0.2;//Decimaç do tipo objeto

        String nome = null; //nulo ==""
        String sexo = "";

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();

        System.out.println("O seu nome é:" + nome);
    }
}




