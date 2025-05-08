package avaliação;

import java.util.Scanner;

public class MainProduto {

    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){

        Produto produto = new Produto();

        System.out.println("Digite o nome ");
        produto.setNome(sc.next());

        System.out.println("Digite o preço do produto ");
        produto.setPreco(sc.nextFloat());

        System.out.println("Digite a quantidade de produtos ");
        produto.setQuantidade(sc.nextInt());

        Produto produto2 = new Produto();

        System.out.println("Digite o nome ");
        produto2.setNome(sc.next());

        System.out.println("Digite o preço do produto ");
        produto2.setPreco(sc.nextFloat());

        System.out.println("Digite a quantidade de produtos ");
        produto2.setQuantidade(sc.nextInt());

        System.out.println(produto.toString());
        System.out.println(produto2.toString());

    }


}