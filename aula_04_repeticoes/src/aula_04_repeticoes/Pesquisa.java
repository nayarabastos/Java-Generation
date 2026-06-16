package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char continua = 'S';
		int esporte,totalRespostas = 0, somaIdades =0,futebol = 0,voleiM18 =0;
		double mediaIdades = 0.0;
		
		while(continua == 'S') {
			System.out.println("***************************************");
			System.out.println("***Pesquisa sobre Esportes Favoritos***");
			System.out.println("***************************************");
			
			System.out.println("Digite sua idade: ");
			int idade = leia.nextInt();
			
			do {
				System.out.println("Escolha o seu esporte favorito: ");
				System.out.println("1 - Futebol");
				System.out.println("2 - Voleibol");
				System.out.println("3 - Basquetebol");
				System.out.println("4 - Outros");
				esporte = leia.nextInt();
			}while(esporte < 1 || esporte > 4);
				
			/*Estatísticas*/
			//Tota de pessoas que responderam à pesquisa
			totalRespostas ++;
			//Soma de todas das idades 
			somaIdades += idade;
			
			//Total de pessoas que gostam de futebol
			if(esporte == 1)
				futebol++;
			
			//Total de pessoas +18 que gostam de vôlei
			if(idade > 18 && esporte == 2)
				voleiM18 ++;
				
			do {
				System.out.println("Deseja continuar? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);
			}while(!(continua == 'S') && !(continua == 'N')); 
			
			System.out.println("***************************************");
		}
		
		mediaIdades = somaIdades/totalRespostas;
		System.out.printf("Média das idades: %.2f\n",mediaIdades);
		
		System.out.printf("Quantidade de pessoas que gostam de futebol: %d\n",futebol);
		System.out.printf("Quantidade de pessoas +18 que gostam de vôlei: %d\n",voleiM18);
		
		leia.close();

	}

}
