import java.util.ArrayList;
import java.util.Scanner;

//Sistema de cadastro de clinica médica
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema +Saúde");
        System.out.println("Preencha as informações dos clientes");

        //Lista de clientes
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        //Loop para criação de 2 clientes
        for(int contador = 0; contador <= 1; contador++) {
            Cliente cliente = new Cliente();
            System.out.println("Digite o nome completo do cliente: ");
            cliente.setNome(sc.nextLine());
            System.out.println("Digite o cpf do cliente: ");
            cliente.setCpf(sc.next());

            //Loop para verificação do CPF
            while (cliente.getCpf().length() != 11) {
                System.out.println("O cpf do cliente deve ter 11 digitos");
                System.out.println("Digite o cpf do cliente: ");
                cliente.setCpf(sc.next());
            }
            System.out.println("Digite o email do cliente: ");
            cliente.setEmail(sc.next());

            clientes.add(cliente);
        }

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
