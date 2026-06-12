package aula_02_unarioS;

import java.util.Scanner;

public class DescontoLoja {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
		
		System.out.println("Digite  o valor da compra: R$ ");
		double valorCompra = leia.nextDouble();
		
		System.out.println("O cliente é Prime? ");
		boolean isPrime = leia.nextBoolean();
		
		boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;
		
		System.out.println("---Status do Pedido--");
		System.out.printf("\nValor da Compra: R$ %.2f",valorCompra);
		System.out.printf("\nCliente Prime? %b",isPrime);
		System.out.printf("\nFrete Grátis? %b",ganhouFrete);
		
		
		
		leia.close();
	}

}
