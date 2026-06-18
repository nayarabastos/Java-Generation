package aula_06_collections;

import java.util.*;

public class AtividadeCanvasCollectionsSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> num = new HashSet<Integer>();
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.printf("Digite o %d° número: ",contador);
			num.add(leia.nextInt());
		}
		System.out.println("\nLista de dados Set: ");
		System.out.println(num);
		
		
		leia.close();

	}

}
