package aula_05_array;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Vetor {
 
	public static void main(String[] args) {
 
		Scanner leia = new Scanner(System.in);
 
		// Vetor inicializado com dados
		int vetorInteiros[] = { 10, 20, 70, 45, 78, 100, 35, 70 };
 
		// Vetor vazio
		float vetorReais[] = new float[5];
 
		// Listar todos os dados do vetor de inteiros
		for (int contador = 0; contador < vetorInteiros.length; contador++) {
			System.out.printf("vetorInteiros[%d] = %d\n", contador, vetorInteiros[contador]);
		}
 
		System.out.println("Tamanho do Vetor de Inteiros: " + vetorInteiros.length);
 
		// Inserir dados no vetor de reais
		for (int contador = 0; contador < vetorReais.length; contador++) {
			System.out.printf("Digite um valor Real para a posição %d: \n", contador);
			vetorReais[contador] = leia.nextFloat();
		}
		
		//Deixa o Array em ordem decrescente
		Arrays.sort(vetorReais);
		
		// Listar todos os dados do vetor de reais
		for (int contador = 0; contador < vetorReais.length; contador++) {
			System.out.printf("vetorReais[%d] = %.2f\n", contador, vetorReais[contador]);
		}
		
		// Listar todos os dados do vetor de reais em ordem decrescente
				for (int contador = vetorReais.length - 1; contador >= 0; contador--) {
					System.out.printf("vetorReais[%d] = %.2f\n", contador, vetorReais[contador]);
				}
 
		System.out.println("Tamanho do Vetor de Reais: " + vetorReais.length);
		
		//Exercício 02
		 System.out.println("\n*****Exercício 02*****");
 
		leia.close();
	}
 
}
 