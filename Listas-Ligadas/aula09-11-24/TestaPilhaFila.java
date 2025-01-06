public class TestaPilhaFila {
    public static void main(String[] args) {
        // Criando uma pilha com capacidade para 5 elementos
        Pilha pilha = new Pilha(6);
        
        // Adicionando alguns elementos à pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(15);
        
        // Exibindo a pilha antes da busca
        System.out.println("Pilha antes da busca:");
        System.out.println(pilha);

        // Criando a instância de AplicacaoFilaPilha
        AplicacaoFilaPilha aplicacao = new AplicacaoFilaPilha();

        // Buscando o elemento 30 na pilha
        int posicao = aplicacao.buscarElementoNaPilha(pilha, 50); 
        
        // Exibindo a posição do elemento encontrado
        if (posicao != -1) {
            System.out.println("Elemento encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento não encontrado.");
        }
        
        // Exibindo a pilha após a busca
        System.out.println("Pilha após a busca:");
        System.out.println(pilha);
    }
}
