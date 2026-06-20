package avaliacao;
import java.util.*;

public class Exercicio_3 {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String[][] estoque = new String[5][2];

        int opcao;
        int totalProdutos = 0;

        do {
            System.out.println("\n1 - Adicionar Produto");
            System.out.println("2 - Atualizar Quantidade");
            System.out.println("3 - Listar Produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {

                case 1:
                    if (totalProdutos < estoque.length) {

                        System.out.print("Nome do produto: ");
                        estoque[totalProdutos][0] = leia.nextLine();

                        System.out.print("Quantidade: ");
                        estoque[totalProdutos][1] = leia.nextLine();

                        totalProdutos++;

                    } else {
                        System.out.println("Estoque cheio!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String produtoBusca = leia.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < totalProdutos; i++) {

                        if (estoque[i][0].equalsIgnoreCase(produtoBusca)) {

                            System.out.print("Nova quantidade: ");
                            estoque[i][1] = leia.nextLine();

                            encontrado = true;
                            System.out.println("Quantidade atualizada!");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("\n=== ESTOQUE ===");

                    for (int i = 0; i < totalProdutos; i++) {
                        System.out.println(
                            "Produto: " + estoque[i][0] +
                            " | Quantidade: " + estoque[i][1]
                        );
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        leia.close();

	}

}
