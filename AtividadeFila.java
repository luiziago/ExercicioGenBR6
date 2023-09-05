package atividadeEstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner ler = new Scanner(System.in);
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("************************************");
            System.out.println("                                    ");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println("                                    ");
            System.out.println("************************************");
            System.out.println("Entre com a opção desejada: ");
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao) {
            case 1:
                System.out.println("Digite o nome do cliente:");
                String nome = ler.nextLine();
                fila.add(nome);
                System.out.println("\nFila:\n");
                for (String cliente : fila) {
                    System.out.println(cliente);
                }
                System.out.println("\nCliente Adicionado!");
                break;
            case 2:
                System.out.println("Lista de clientes na Fila:");
                for (String cliente : fila) {
                    System.out.println(cliente);
                }
                break;
            case 3:
                if (fila.isEmpty()) {
                    System.out.println("A fila está vazia.");
                } else {
                    fila.remove();
                    System.out.println("O cliente foi chamado.");
                }
                break;
            case 0:
                System.out.println("Programa finalizado!");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    ler.close();
}
}
