package avaliacao;
import java.util.*;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int colecao = 0; colecao < 5; colecao++ ) {
			System.out.println("Digite um número");
			num.add(leia.nextInt());
		}
		System.out.println("Coleção: " +num);
		System.out.println("Soma: " +calcSoma(num));
		System.out.println("Média: " +calcMedia(num));
		System.out.println("Maior: " +maiorNum(num));
		
		leia.close();
		
	}
	
	public static int calcSoma(ArrayList<Integer> num) {
		
		int soma = 0;
		
		for(int colecao = 0;colecao < num.size();colecao++) {
			soma+= num.get(colecao);
		}
		
		return soma;
	}
	
	public static double calcMedia(ArrayList<Integer> num){
		int soma = calcSoma(num);
		return (double) soma/num.size();
	}
	
	public static int maiorNum(ArrayList<Integer> num) {
		int maior = num.get(0);
		
		for(int colecao  = 1; colecao < num.size(); colecao++) {
			if(num.get(colecao) > maior) {
				maior = num.get(colecao);
			}
		}
		return maior;
	}

}
