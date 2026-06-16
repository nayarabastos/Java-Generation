package aula_04_repeticoes;

import java.util.Scanner;

public class AtividadeCanvasFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 01
		
		System.out.println("*****Exercício 01*****");
		int primeiroNum, ultimoNum;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNum = leia.nextInt();
		
		System.out.println("Digite o útimo número do intervalo: ");
		ultimoNum = leia.nextInt();
		
		 if (primeiroNum >= ultimoNum) {
	            System.out.println("\nIntervalo inválido!");
	        } else {
	            System.out.println("\nNo Intervalo entre " + primeiroNum + " e " + ultimoNum + ":");

	            for (int i = primeiroNum; i <= ultimoNum; i++) {

	                if (i % 3 == 0 && i % 5 == 0) {
	                    System.out.println(i + " é múltiplo de 3 e 5");
	                }
	            }
		}
		 
		 
		//Exercício 02
		 
		 System.out.println("\n*****Exercício 05*****");
		 int num,numPar = 0,numImpar = 0;
		 
		 for(int i =1;i <= 10;i++) {
			 System.out.printf("Digite o %d° número\n",i);
			 num = leia.nextInt();
			 
			 if(num %2 == 0) {
				 numPar++;
			 }else {
				 numImpar++;
			 }
		 }	
		 
		 System.out.printf("Total de números pares: %d\n",numPar);
		 System.out.printf("Total números ímpares: %d\n",numImpar);
		 
		leia.close();
	}      
}
	
