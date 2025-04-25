package teste;

import java.util.Scanner;

public class SistemaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto[] produtos = new Produto[2];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            double preco = 0;
            int quantidade = 0;

            // Validação de preço
            while (true) {
                try {
                    System.out.print("Digite o preço do produto: ");
                    preco = Double.parseDouble(scanner.nextLine());
                    if (preco <= 0) throw new IllegalArgumentException();
                    break;
                } catch (Exception e) {
                    System.out.println("Preço inválido. Digite um valor maior que zero.");
                }
            }

            // Validação de quantidade
            while (true) {
                try {
                    System.out.print("Digite a quantidade em estoque: ");
                    quantidade = Integer.parseInt(scanner.nextLine());
                    if (quantidade < 0) throw new IllegalArgumentException();
                    break;
                } catch (Exception e) {
                    System.out.println("Quantidade inválida. Digite um número maior ou igual a zero.");
                }
            }

            produtos[i] = new Produto(nome, preco, quantidade);
            System.out.println();
        }

        // Exibindo informações dos produtos
        System.out.println("=== INFORMAÇÕES DOS PRODUTOS ===");
        for (Produto p : produtos) {
            p.imprimirInformacoes();
        }

        scanner.close();
    }
}