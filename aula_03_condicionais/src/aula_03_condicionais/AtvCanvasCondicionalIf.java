package aula_03_condicionais;

import java.util.Scanner;

public class AtvCanvasCondicionalIf {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		int a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		int b = leia.nextInt();
		
		System.out.println("Digite número C: ");
		int c = leia.nextInt();
		
		int soma = a + b;
		
		if(soma > c){
			System.out.printf("%d + %d = %d > %d\n",a,b,soma,c);
			System.out.println("A soma de A + B é Maior do que C");
		} else if(soma < c){
			System.out.printf("%d + %d = %d < %d\n",a,b,soma,c);
			System.out.println("A soma de A + B é Menor do que C");
		}else if(soma == c){
			System.out.printf("%d + %d = %d = %d\n",a,b,soma,c);
			System.out.println("A Soma de A + B é igual a C");
		}

		System.out.println("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		if(numero %2 == 0 && numero > 0) {
			System.out.printf("O Número %d é par e positivo!",numero);
		}else if(numero %2 != 0 && numero < 0) {
			System.out.printf("O Número %d é ímpar e negativo!",numero);
		}else if(numero %2 == 0 && numero < 0) {
			System.out.printf("O Número %d é par e negativo!",numero);
		}else if(numero %2 != 0 && numero > 0) {
			System.out.printf("O Número %d é ímpar e negativo!",numero);
		}
		
		leia.close();

	}

}
