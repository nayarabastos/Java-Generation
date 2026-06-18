package aula_02_unarios;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int contador = 1000;
		
		System.out.println("valor inicial de contador: " + contador);
		
		System.out.println("valor pré incrementado: " + (++contador));
		
		System.out.println("valor pós incrementado: " + (contador++));

		System.out.println("Novo valor: " + contador);
	}

}
