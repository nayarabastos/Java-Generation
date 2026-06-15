package avaliacao_condicionais;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = leia.next();
		
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		
		if(idade >= 18) {
			System.out.printf("Acesso liberado por idade para %s",nome);
		}else if(idade < 18){
			System.out.printf("%s, você possui autorização dos seus responsáveis? ",nome);
			boolean autorizacao = leia.nextBoolean();
				if(autorizacao == true) {
					System.out.printf("Acesso liberado com autorização para %s",nome);
				}else  {
					System.out.printf("Acesso negado para %s",nome);
				}
		}
		
		leia.close();

	}

}
