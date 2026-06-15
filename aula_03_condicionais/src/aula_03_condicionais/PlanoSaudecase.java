package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudecase {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = leia.next();
		
		System.out.println("****************************************************");
		System.out.println("                     FAIXA ETÁRIA                   ");
		System.out.println("****************************************************");
		System.out.println("             1 - De 0 à 10 anos de idade            ");
		System.out.println("             2 - De 11 à 29 anos de idade           ");
		System.out.println("             3 - De 30 à 45 anos de idade           ");
		System.out.println("             4 - De 0 à 65 anos de idade            ");
		System.out.println("             5 - De 0 à 11 anos de idade            ");
		System.out.println("             6 - Acima de 65 anos de idade          ");
		System.out.println("                                                    ");
		System.out.println("****************************************************");
		
		System.out.printf("%s, escolha a sua Faixa Etária:\n",nome);
		int faixaEtaria = leia.nextInt();
		
		switch(faixaEtaria) {
		case 1:
			System.out.printf("%s, A mensalidade do seu plano é R$ 100,00",nome);
		break;
		case 2:
			System.out.printf("%s, A mensalidade do seu plano é R$ 200,00",nome);
		break;
		case 3:
			System.out.printf("%s, A mensalidade do seu plano é R$ 300,00",nome);
		break;
		case 4:
			System.out.printf("%s, A mensalidade do seu plano é R$ 500,00",nome);
		break;
		case 5:
			System.out.printf("%s, A mensalidade do plano é R$ 600,00",nome);
		break;
		case 6:
			System.out.printf("A mensalidade do seu plano é R$ 1000,00");
		break;
		default:
			System.out.printf("Valor inválido. Escolha um número de 1 à 6");
		}
		
		leia.close();
	}

}
