package aula_03_condicionais;

import java.util.Scanner;

public class AtvCanvasCondicionalSwitch {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	        int codigo, quantidade;
	        String produto = "";
	        double preco = 0, total;

	        System.out.print("Código do Produto: ");
	        codigo = leia.nextInt();

	        System.out.print("Quantidade: ");
	        quantidade = leia.nextInt();

	        switch (codigo) {
	            case 1:
	                produto = "Cachorro Quente";
	                preco = 10.00;
	                break;

	            case 2:
	                produto = "X-Salada";
	                preco = 15.00;
	                break;

	            case 3:
	                produto = "X-Bacon";
	                preco = 18.00;
	                break;

	            case 4:
	                produto = "Bauru";
	                preco = 12.00;
	                break;

	            case 5:
	                produto = "Refrigerante";
	                preco = 8.00;
	                break;

	            case 6:
	                produto = "Suco de laranja";
	                preco = 13.00;
	                break;

	            default:
	                System.out.println("Código inválido!");
	                return;
	        }

	        total = quantidade * preco;

	        System.out.println("\nProduto: " + produto);
	        System.out.printf("Valor total: R$ %.2f%n", total);
	        
	        float numero1, numero2, resultado;
	        int operacao;

	        System.out.print("Digite o 1º número: ");
	        numero1 = leia.nextFloat();

	        System.out.print("Digite o 2º número: ");
	        numero2 = leia.nextFloat();

	        System.out.print("Operação: ");
	        operacao = leia.nextInt();

	        switch (operacao) {

	            case 1:
	                resultado = numero1 + numero2;
	                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
	                break;

	            case 2:
	                resultado = numero1 - numero2;
	                System.out.println(numero1 + " - " + numero2 + " = " + resultado);
	                break;

	            case 3:
	                resultado = numero1 * numero2;
	                System.out.println(numero1 + " * " + numero2 + " = " + resultado);
	                break;

	            case 4:
	                resultado = numero1 / numero2;
	                System.out.println(numero1 + " / " + numero2 + " = " + resultado);
	                break;

	            default:
	                System.out.println("Operação Inválida!");
	        }

	        leia.close();
	}

}
