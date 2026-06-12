package aula_01_variaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1 = 10;
		int numero2 = 5;
		float numero3,numero4;
		String  nome;
		
		System.out.println("Variável número 1 = "+numero1);
		System.out.println("Variável número 2 = "+numero2);

		System.out.printf("%d + %d = %d\n",numero1,numero2,numero1+numero2);
		
		System.out.println("Digite o primeiro valor: ");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		numero4 = leia.nextFloat();
		
		System.out.printf("%.2f x %.2f = %.2f\n",numero3,numero4,numero3+numero4);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("");
	}

}
