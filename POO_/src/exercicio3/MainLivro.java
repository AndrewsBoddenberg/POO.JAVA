package exercicio3;

import java.util.Scanner;

public class MainLivro {

    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {

        Livro livro = new Livro();

        System.out.println("Digite o nome do autor ");
        livro.setAutor(sc.next());

        System.out.println("Digite o título do livro ");
        livro.setTitulo(sc.next());

        System.out.println("Digite o ano que o livro foi públicado");
        livro.getAnoPublicacao(sc.next());

        System.out.println(livro.toString());


        }
    }
