package avaliacao_condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = leia.next();
		
		System.out.println("Digite a sua nota final de 0 à 10: ");
		float nota = leia.nextFloat();
		
		if(nota < 0 || nota > 10){
		    System.out.println("Nota inválida. Digite uma nota de 0 a 10");
		}
		else if(nota < 5){
		    System.out.printf("%s, você está reprovado", nome);
		}
		else if(nota < 7){
		    System.out.printf("%s, você está de recuperação", nome);
		}
		else{
		    System.out.printf("%s, você está aprovado", nome);
		}
		
		leia.close();

	}

}
