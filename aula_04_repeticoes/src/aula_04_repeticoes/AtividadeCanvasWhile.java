package aula_04_repeticoes;

import java.util.Scanner;

public class AtividadeCanvasWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//Exercício 03
		System.out.println("*****Exercício 03*****\n");
		int idade;
		int menores21 = 0;
		int maiores50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			if(idade < 21){
				menores21++;
			}else if(idade > 50) {
				maiores50++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		 System.out.printf("Total de pessoas menores de 21 anos: %d\n", menores21);
	     System.out.printf("Total de pessoas maiores de 50 anos: %d\n", maiores50);
	     
	     
	     //Exercício 04
	     System.out.println("\n*****Exercício 04*****");
	     int idadePesquisa,genero,area;
	     char continuar = 'S';
	     int total = 0,totalBack = 0 ,totalM = 0,totalH = 0,totalNB = 0,somaIdade = 0;
	     double media;
	     
	     
	     while(continuar == 'S') {
	    	 
	    	 System.out.println("Qual a sua idade?");
		     idadePesquisa = leia.nextInt();
	    	 
		     System.out.println("Qual a sua identidade de gênero?\n"
		     		+ "1 - Mulher Cis\n"
		     		+ "2 - Homem Cis\n"
		     		+ "3 - Não Binário\n"
		     		+ "4 - Mulher Trans\n"
		     		+ "5 - Homem Trans\n"
		     		+ "6 - Outros\n");
		     genero = leia.nextInt();
		     
		     System.out.println("Em qual área de Desenvolvimento você atua?\n"
		     		+ "1 - Backend\n"
		     		+ "2 - Frontend\n"
		     		+ "3 - Mobile\n"
		     		+ "4 - FullStack\n");
		     area = leia.nextInt();
		     
		     if(area == 1) {
		    	 totalBack++;
		     }
		     if((genero == 1 || genero == 4) && area == 2){
		    	 totalM++;
		     }
		     if((genero == 2 || genero == 5) && area == 3 && idadePesquisa > 40) {
		    	 totalH++;
		     }
		     if(genero == 3 && area == 4 && idade <30) {
		    	 totalNB++;
		     }
		     
		     total++;
	    	 somaIdade += idadePesquisa;
	    	 
	    	 System.out.println("Deseja continuar a pesquisa?(S/N)");
	    	 continuar = leia.next().toUpperCase().charAt(0);
		          
	     }
	     
	     media = (double)somaIdade/total;
	     
	     System.out.printf("O número de pessoas desenvolvedoras Backend é: %d\n",totalBack);
	     System.out.printf("O número de Mulheres Cis e Trans desenvolvedoras Frontend é: %d\n",totalM);
	     System.out.printf("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos é: %d\n",totalH);
	     System.out.printf("O número de Não Binários desenvolvedores FullStack menores de 30 anos é: %d\n",totalNB);
	     System.out.printf("O número total de pessoas que responderam à pesquisa é: %d\n",total);
	     System.out.printf("A média de idade das pessoas que responderam à pesquisa é: %.2f\n",media);
		
		leia.close();

	}

}
