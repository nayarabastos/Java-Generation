package aula_06_collections;

import java.util.*;

public class AtividadeCollectionsFila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		Queue<String> fila = new LinkedList<String>();
		
		do {
			System.out.println("*****************************************************************\n\n"
					+ "1 - Adicionar Cliente na Fila\n"
					+ "2 - Listar todos os Clientes\n"
					+ "3 - Retirar Clientes da Fila\n"
					+ "0 - Sair\n\n"
					+ "\"****************************************************************\n"
					+ "Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite um nome: ");
				fila.add(leia.next());
				System.out.printf("\nFila: \n%s\n",fila);
				System.out.println("\nCliente Adicionado!\n");
			}
			
			if(opcao == 2 && fila.isEmpty()){
				System.out.println("A Fila está vazia! Digite 1 para Adicionar um cliente na Fila.\n");				
			}else if(opcao == 2) {
				System.out.printf("Lista de clientes na Fila: \n%s\n\n",fila);
			}
			
			if(opcao == 3 && fila.isEmpty()) {
				System.out.println("A Fila está vazia! Digite 1 para Adicionar um cliente na Fila.\n");
			}else if (opcao == 3) {
				fila.remove();
				System.out.printf("\nFila: \n%s\n",fila);
				System.out.println("\nO Cliente foi Chamado!\n");
			}
			
			if(opcao == 0) {
				System.out.println("Programa Finalizado!");
			}			
		}while(opcao != 0);

		
		
		leia.close();
	}

}
