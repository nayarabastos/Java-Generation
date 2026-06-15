package avaliacao_condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, resultado;
        int operacao;

        System.out.println("Digite o 1º número: ");
        numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        numero2 = leia.nextFloat();

        System.out.print("Operação: \n"
        		+ "1 - Soma\n"
        		+ "2 - Subtração\n"
        		+ "3 - Multiplicação\n"
        		+ "4 - Divisão\n");
        operacao = leia.nextInt();

        switch (operacao) {

            case 1:
                resultado = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                System.out.println("Operação: Adição");
                System.out.printf("Resultado: %.2f",resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                System.out.println("Operação: Subtração");
                System.out.printf("Resultado: %.2f",resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                System.out.println("Operação: Multiplicação");
                System.out.printf("Resultado: %.2f",resultado);
                break;

            case 4:
                resultado = numero1 / numero2;
                System.out.println(numero1 + " / " + numero2 + " = " + resultado);
                System.out.println("Operação: Divisão");
                System.out.printf("Resultado: %.2f",resultado);
                break;

            default:
                System.out.println("Operação Inválida!");
        }
		
		leia.close();

	}

}
