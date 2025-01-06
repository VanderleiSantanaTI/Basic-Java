

public class Fila {
    private No2 primeiro;
    private No2 ultimo;
    
    //construtor Padrao
    //getters e setters, Nem PENSAR

    public boolean filaVazia(){
        return primeiro == null;
    }

    public void enfileira (Pessoa p){
        No2 novo = new No2(p);
        if(filaVazia()){
            primeiro=novo;
        }else{
            ultimo.setProxmo(novo);
        }
        ultimo = novo;
    }

    public Pessoa desenfileira (){
        if(filaVazia()) return null;
        Pessoa p = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if(filaVazia()) ultimo = null;
        return p;
    }


    public Pessoa getFirst(){
        if (filaVazia()) return null;
        return primeiro.getInfo();
    }

    public Pessoa getLast(){
        if (filaVazia()) return null;
        return ultimo.getInfo();
    }
    
    
    public static Fila mergeFilas(Fila fila1, Fila fila2) {
        Fila filaMerge = new Fila();
        
        while (!fila1.filaVazia() || !fila2.filaVazia()) {

            if (!fila1.filaVazia()) {
                filaMerge.enfileira(fila1.desenfileira());
            }

            if (!fila2.filaVazia()) {
                filaMerge.enfileira(fila2.desenfileira());
            }
        }
    
        return filaMerge;
    }

    @Override
    public String toString(){
        if(filaVazia()) return "fila vazia";
        No2 aux = primeiro;
        String s = "";

        while(aux != null){
            s += aux + " ";
            aux = aux.getProximo();
        }
        return s;
    }
}