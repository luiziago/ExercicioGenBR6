package atividadeEstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	    public static void main(String[] args) {
	        Stack<String> pilha = new Stack<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao = -1;
	        while (opcao != 0) {
	            System.out.println("************************************");
	            System.out.println("                                    ");
	            System.out.println("1 - Adicionar Livro na pilha");
	            System.out.println("2 - Listar todos os Livros");
	            System.out.println("3 - Retirar Livro da pilha");
	            System.out.println("0 - Sair");
	            System.out.println("                                    ");
	            System.out.println("************************************");
	            System.out.println("Entre com a opção desejada: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine();
	            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro:");
                    String nome = scanner.nextLine();
                    pilha.push(nome);
                    System.out.println("Pilha:\n");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                    System.out.println("\nLivro adicionado!\n");
                    break;
                case 2:
                    System.out.println("Lista de Livros na Pilha:");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        pilha.pop();
                        System.out.println("Um Livro foi retirado da pilha!");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}