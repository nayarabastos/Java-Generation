package avaliacao;

import java.util.*;

public class Exercicio_2 {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);

        int quantidadeAlunos = 3;
        String[][] alunos = new String[quantidadeAlunos][3];
        double somaNotas = 0;
        
        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.println("\nAluno " + (i + 1));

            System.out.print("Nome: ");
            alunos[i][0] = leia.nextLine();

            System.out.print("Idade: ");
            alunos[i][1] = leia.nextLine();

            System.out.print("Nota Final: ");
            alunos[i][2] = leia.nextLine();

            somaNotas += Double.parseDouble(alunos[i][2]);
        }

        System.out.println("\n=== ALUNOS CADASTRADOS ===");

        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.println(
                "Nome: " + alunos[i][0] +
                " | Idade: " + alunos[i][1] +
                " | Nota: " + alunos[i][2]
            );
        }

        double media = somaNotas / quantidadeAlunos;

        System.out.printf("\nMédia Geral das Notas: %.2f%n", media);
	}

}
