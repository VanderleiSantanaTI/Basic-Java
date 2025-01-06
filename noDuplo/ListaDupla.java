public class ListaDupla {
    private int nNos;
    private Noduplo primeiro;
    private Noduplo ultimo;

    // assumimos somente o construtor padra, que "zera" todos os atributos
    public boolean listaVazia() {
        return nNos == 0;
    }

    // para saber o tamanho da lista 
    public int size(){
        return nNos;
    }

    public void inserirNovoNoInicio(int info){
        Noduplo novo = new Noduplo(info);
        if (listaVazia()){
            ultimo = novo;
        } else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;  // depois de ter dado as mãos o novo passou a ser o primeiro
        nNos++;
    }

    public void insereFim(int info){
        Noduplo novo = new Noduplo(info);

        if (listaVazia()){
            primeiro = novo;
        }
        else{
            novo.setAnterior(ultimo);  // Dão as mãos
            ultimo.setProximo(novo);
        }
        ultimo = novo;  // depois de ter dado as mãos o novo passou a ser o útimo
        nNos++;
    }

    
    

    @Override
    public String toString() {

        if(listaVazia()) return "lista vazia";
        Noduplo aux = primeiro;
        String s = "//";
        while (aux != ultimo) {
            s += aux + "";
            aux = aux.getProximo();
        }
        s += aux + "//";
        return s;

    }

}
