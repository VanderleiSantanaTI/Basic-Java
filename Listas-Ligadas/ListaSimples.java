/*
 * 1-contar quantos elementos tem na lista
 * 2- contar quantos elementos pares tem na lista
 * 3- somar todos os elementos da lista
 * 4- encontar o maior elemento da lista
 * 5- encontar a posição do maior elemento da lista, considerando a primeira posição como 1
 * 6- fazer o append de uma lista L2 em uma Lista L1
 * 7- dizer se duas listas são iguais
 */


public class ListaSimples {
    private No primeiro;

    //por clareza
    public ListaSimples() {
        this.primeiro = null;
    }
    //não temos gets e sets, pois o atributo primeiro deve ser minipulado internamente
    // -> princípio do menor 
    
    public boolean listaVazia() {
        return this.primeiro == null;
    }

    public void inserirInicio(int i) {
        No novo = new No(i);
        if (!listaVazia()) {
            novo.setProximo(this.primeiro);
        }
        this.primeiro = novo;

    }


    @Override
    public String toString() {
        String str = "lista";
        if (listaVazia()) {
             str += " vazia";
        }else{
            No aux = this.primeiro;
            while (aux != null) {
                str +=  aux;
                aux = aux.getProximo();
            }
            str += "//";
        }
        return str;
    }

    public void inserirFim(int i) {
        No novo = new No(i);
        if (listaVazia()) {
            this.primeiro = novo; //se a lista estiver vazia, o novo nó é o primeiro
        }else{
            No aux = this.primeiro; //começa do primeiro
            while (aux.getProximo() != null) { //enquanto não for o último
                aux = aux.getProximo(); //avança
            }
            aux.setProximo(novo);
        }
    }
}






    