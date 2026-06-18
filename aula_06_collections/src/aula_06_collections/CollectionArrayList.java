package aula_06_collections;
import java.util.*;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(9);
		numeros.add(7);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("O objeto está presente no indice 1: "+numeros.get(1));
		System.out.println("O ínice do objeto 1: "+numeros.indexOf(1));
		
		numeros.set(3, 25);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		numeros.remove(0);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		//Ordena em ordem crescente
		numeros.sort(null);
		
		//Ordena em ordem decrescente
		numeros.sort(Comparator.reverseOrder());
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}

}
