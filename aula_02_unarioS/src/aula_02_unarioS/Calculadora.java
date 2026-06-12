package aula_02_unarioS;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double numero1, numero2;
		
		System.out.println("*** CALCULADORA BÁSICA ***");
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o primeiro número: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("\n %.2f + %.2f = %.2f",numero1,numero2,numero1+numero2);
		System.out.printf("\n %.2f - %.2f = %.2f",numero1,numero2,numero1-numero2);
		System.out.printf("\n %.2f x %.2f = %.2f",numero1,numero2,numero1*numero2);
		System.out.printf("\n %.2f / %.2f = %.2f",numero1,numero2,numero1/numero2);
		System.out.printf("\n %.2f ^ %.2f = %.2f",numero1,numero2,Math.pow(numero1, numero2));
		System.out.printf("\n Raiz quadrada %.2f = %.2f",numero1,Math.sqrt(numero1));
		
		leia.close();

	}

}
