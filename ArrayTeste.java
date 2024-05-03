package prova1;

import java.util.Scanner;

public class ArrayTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do array: ");
        int tamanho = scanner.nextInt();
        Array array = new Array(tamanho);

        int opcao;
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Alterar elemento");
            System.out.println("4. Listar elementos");
            System.out.println("5. Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o elemento a ser adicionado: ");
                    int elementoAdicionar = scanner.nextInt();
                    array.adicionarElemento(elementoAdicionar);
                    break;
                case 2:
                    array.removerElemento();
                    break;
                case 3:
                    System.out.print("Informe a posição do elemento a ser alterado: ");
                    int posicaoAlterar = scanner.nextInt();
                    System.out.print("Informe o novo elemento: ");
                    int novoElemento = scanner.nextInt();
                    array.alterarElemento(posicaoAlterar, novoElemento);
                    break;
                case 4:
                    array.listarElementos();
                    break;
                case 5:
                    System.out.println("Encerrando a aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
