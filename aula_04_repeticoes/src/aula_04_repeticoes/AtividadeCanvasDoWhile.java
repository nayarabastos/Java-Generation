package aula_04_repeticoes;

import java.util.Scanner;

public class AtividadeCanvasDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 05
		System.out.println("*****Exercício 05*****");
		int num;
		int soma = 0;
		
		do {
			System.out.println("Digite um número:");
			num = leia.nextInt();
			
			if(num > 0) {
				soma += num;
			}
		}while(num != 0);
		
		System.out.printf("A soma dos números positivos é: %d\n",soma);
		
		
		
		//Exercício 06
		System.out.println("\n*****Exercício 06*****");
		int numero,total = 0;
		float media,somaMulti = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero != 0 && numero %3 == 0) {
				total++;
				somaMulti += numero;
			}
		}while(numero != 0);
		
		media = somaMulti/total;
		
		System.out.println(media);
		
		
		leia.close();

		
	
	}

}
