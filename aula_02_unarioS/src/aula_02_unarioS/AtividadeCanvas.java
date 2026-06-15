package aula_02_unarioS;

import java.util.Scanner;

public class AtividadeCanvas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		//Attividade 1
		System.out.println("----ATIVIDADE 1----");
		System.out.println("Digite o seu salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("\nO seu salário novo ficou: %.2f ",novoSalario);
		
		
		//Atividade 2
		System.out.println("\n----ATIVIDADE 2----");
		System.out.println("\nDigite a 1° nota: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite a 2° nota: ");
		float nota2 = leia.nextFloat();
		
		System.out.println("Digite a 3° nota: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("Digite a 4° nota: ");
		float nota4 = leia.nextFloat();
		
		float media = ((nota1+nota2+nota3+nota4)/4);
		
		System.out.printf("A sua média final ficou: %.2f",media);
		
		
		//Atividade 3
		System.out.println("\n----ATIVIDADE 3----");
		System.out.println("Digite o valor de seu salário bruto: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor de seu adinional noturno: ");
		float adcNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor de suas horas extras: ");
		float horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos");
		float descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adcNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O seu salário líquido ficou no valor de %.2f",salarioLiquido);
		
		
		//Atividade 4
		System.out.println("\n----ATIVIDADE 4----");
		System.out.println("Digite o 1° número: ");
		float n1 = leia.nextFloat();
		
		System.out.println("Digite o 2° número: ");
		float n2 = leia.nextFloat();
		
		System.out.println("Digite o 2° número: ");
		float n3 = leia.nextFloat();
		
		System.out.println("Digite o 2° número: ");
		float n4 = leia.nextFloat();
		
		float calculo = (n1*n2)-(n3*n4);
		System.out.printf("A diferença entre os valores é: %.2f",calculo);
		
		
		leia.close();
	}

}
