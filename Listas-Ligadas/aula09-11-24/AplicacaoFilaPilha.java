/**
 * Essa classe é  responsável por buscar um elemento na pilha e retornar
 * a posição do elemento na pilha e deixar a pilha como estava antes.
 *  foi criado um objeto pessoa campo Nome e AnoNascimento
 *  foi forçado um String para poder usar o campo nome pois o construtor 
 *  de Passoa só havia o campo de nome e AnoNascimento 
 */

public class AplicacaoFilaPilha {

    public int buscarElementoNaPilha(Pilha p, int x) {
        Fila f1 = new Fila(); 
        Pilha pilhaAux = new Pilha(); 
        int posicao = p.tamanho(); 
        int resultado = -1; 
        
        
        while (!p.estarVazia()) {
            int elemento = p.pop();
            
            //***
            f1.enfileira(new Pessoa(Integer.toString(elemento), elemento));

            if (elemento == x) {
                resultado = posicao;
            }
            posicao--;
        }

        while (!f1.filaVazia()) {
            pilhaAux.push(f1.desenfileira().getAnoNascimento());
        }

        while (!pilhaAux.estarVazia()) {
            p.push(pilhaAux.pop());
        }

        return resultado; 
    }
}
