package aula_06_collections;

import java.util.*;

public class AtividadeCanvasCollectionsArray {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cor = new ArrayList<String>();
		
		System.out.println("Adicione uma cor: ");
		cor.add(leia.next());
		cor.add(leia.next());
		cor.add(leia.next());
		cor.add(leia.next());
		cor.add(leia.next());
		
		cor.sort(null);
		System.out.println(cor);
		
		cor.sort(Comparator.reverseOrder());
		System.out.println(cor);
	
		
		leia.close();
		
		
	}

}
