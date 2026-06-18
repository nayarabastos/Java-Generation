package aula_05_array;

import java.util.Scanner;

public class AtividadeCanvasMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercício 03
		System.out.println("*****Exercício 03*****\n");
		int matriz[][] = new int[3][3]; 
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0;coluna < matriz.length; coluna++) {
				System.out.printf("Digite um número para a linha %d da coluna %d:\n",linha,coluna);
				matriz[linha][coluna] = leia.nextInt();
				
			}
		}
			
			System.out.println("\nElementos da Diagonal Principal: ");
			
			for(int linha = 0;linha < 3;linha++ ) {
				for(int coluna = 0; coluna < 3; coluna++ ) {
					if(linha == coluna) {
						System.out.println(matriz[linha][coluna] +" ");
						somaPrincipal += matriz[linha][coluna];
					}
				}
			}
			
			System.out.println("\nElementos da Diagonal Secundária: ");
			for(int linha = 0;linha < 3;linha++ ) {
				for(int coluna = 0; coluna < 3; coluna++ ) {
					if(linha + coluna == 2) {
						System.out.println(matriz[linha][coluna] +" ");
						somaSecundaria += matriz[linha][coluna];
					}
				}
			}
			
		System.out.printf("A soma dos elementos da Diagonal Principal é: \n%d\n",somaPrincipal);
		System.out.printf("A soma dos elementos da Diagonal Secundária é: \n%d\n",somaSecundaria);
			
		
	    //Exercício 04
	    System.out.println("\n*****Exercício 04*****");
		float notas[][] = new float[10][4];
		float media[] = new float[10];
		
		for(int participante = 0; participante < notas.length; participante++) {
			float somaNotas = 0;
			for(int bimestre = 0; bimestre < notas[participante].length; bimestre++) {
				System.out.printf("Participante n° %d, digite a nota %d: ",participante,bimestre);
				notas[participante][bimestre] = leia.nextFloat();
				somaNotas+=notas[participante][bimestre];
				media[participante] = somaNotas/4;
			}	
		}
		for(int participante = 0; participante < 10; participante++) {
			System.out.printf("Média final do participante %d: %.1f\n",participante,media[participante]);	
		}
		

			
		
		leia.close();
	}

}
