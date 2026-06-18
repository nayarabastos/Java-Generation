package aula_06_collections;

import java.util.*;


public class AtividadeCanvasCollectionsPilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		Deque<String> livros = new LinkedList<String>();
		
		do {
			System.out.println("*****************************************************************\n\n"
					+ "1 - Adicionar Livro na Pilha\n"
					+ "2 - Listar todos os Livros\n"
					+ "3 - Retirar Livro da Fila\n"
					+ "0 - Sair\n\n"
					+ "\"****************************************************************\n"
					+ "Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o nome do Livro: ");
				livros.add(leia.next());
				System.out.printf("\nPilha: \n%s\n",livros);
				System.out.println("\nLivro Adicionado!\n");
			}
			
			if(opcao == 2 && livros.isEmpty()){
				System.out.println("A pilha está vazia! Digite 1 para Adicionar um Livro na Pilha.\n");				
			}else if(opcao == 2) {
				System.out.printf("Lista de Livros na Pilha: \n%s\n\n",livros);
			}
			
			if(opcao == 3 && livros.isEmpty()) {
				System.out.println("A Pilha está vazia! Digite 1 para Adicionar um Livro na Pilha.\n");
			}else if (opcao == 3) {
				livros.remove();
				System.out.printf("\nFila: \n%s\n",livros);
				System.out.println("\nO Livro foi retirado da Pilha!\n");
			}
			
			if(opcao == 0) {
				System.out.println("Programa Finalizado!");
			}			
		}while(opcao != 0);

		
		
		leia.close();

	}

}
