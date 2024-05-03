package prova1;

class Array {
    private int[] vetor;
    private int tamanho;
    private int tamanhoAtual;

    public Array(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new int[tamanho];
        this.tamanhoAtual = 0;
    }

    public void adicionarElemento(int elemento) {
        if (tamanhoAtual < tamanho) {
            vetor[tamanhoAtual] = elemento;
            tamanhoAtual++;
            System.out.println("Elemento adicionado na última posição do vetor.");
        } else {
            System.out.println("O vetor está cheio. Não é possível adicionar mais elementos.");
        }
    }

    public void removerElemento() {
        if (tamanhoAtual > 0) {
            tamanhoAtual--;
            System.out.println("Elemento removido da última posição do vetor.");
        } else {
            System.out.println("O vetor está vazio. Não há elementos para remover.");
        }
    }

    public void alterarElemento(int posicao, int novoElemento) {
        if (posicao >= 0 && posicao < tamanhoAtual) {
            vetor[posicao] = novoElemento;
            System.out.println("Elemento na posição " + posicao + " foi alterado para " + novoElemento);
        } else {
            System.out.println("Posição inválida. Não é possível alterar o elemento.");
        }
    }

    public void listarElementos() {
        System.out.println("Elementos no vetor:");
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
