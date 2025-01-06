

public class Pilha {
    private int[] dados;
    private int topo=0;
    private int capacidade;
    
    public Pilha(int capacidade){
        dados = new int[capacidade];
        this.capacidade = capacidade;

    }

    public Pilha(){ // default
        this(10); 
    }

    public boolean estarVazia(){
        return topo == 0;
    }

    public boolean estarCheia(){
        return topo == capacidade; 
    }

    public int tamanho(){
        return topo;
    }

    public int peek(){
        return dados[topo - 1];
    }
    public void push(int i){
        dados[topo++]=i; //inserir para depoois somar
    }

    public int pop(){

        return dados[--topo];
    }

    @Override
    public String toString(){
        String s = "";
        if (estarVazia()){
            s += "Pilha vazia";
        }else{
            for(int i = topo-1; i >= 0; i--){
                s+=dados[i]+"\n";
            }
        }
        return s + "------------------\n";
    }


}


