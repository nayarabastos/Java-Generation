package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeCanvasVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 01
		System.out.println("*****Exercício 01*****");
		
	    int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

	        int numero;
	        boolean encontrado = false;
	        
	        System.out.println(Arrays.toString(vetor));
	        System.out.print("Digite o número que você deseja encontrar: ");
	        numero = leia.nextInt();

	        for (int contador = 0; contador < vetor.length; contador++) {

	            if (vetor[contador] == numero) {
	                System.out.println("\nO número " + numero + " está localizado na posição: " + contador);
	                encontrado = true;
	                break;
	            }

	        }

	        if (!encontrado) {
	            System.out.println("\nO número " + numero + " não foi encontrado!");
	        }
		
	     //Exercício 02 
		System.out.println("\n*****Exercício 02*****");
		
		int vetorInt[] = new int[10];
		float soma = 0;
		float media;
		
		for(int contador = 0; contador < vetorInt.length; contador++) {
			soma += vetorInt[contador];
			System.out.printf("Digite o número para a posição n° %d: ",contador);
			vetorInt[contador] = leia.nextInt();			
		}
		
		System.out.println("Elementos nos índices ímpares: ");
		for(int contador = 0; contador < vetorInt.length; contador++) {
			if(contador %2 != 0) {
				System.out.println((vetorInt[contador]));
			}		
		}
		
		System.out.println("Elementos nos índices pares:");
		for(int contador = 0; contador < vetorInt.length; contador++) {
			if(contador %2 == 0) {
				System.out.println(vetorInt[contador]);
			}		
		}
		
		
		System.out.println(soma);
		
		
		leia.close();

	}

}
