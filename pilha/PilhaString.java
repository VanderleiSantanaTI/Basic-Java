package pilha;

public class PilhaString {
    private char[] dados;
    private int topo=0;
    private int capacidade;
    
    public PilhaString(int capacidade){
        dados = new char[capacidade];
        this.capacidade = capacidade;

    }

    public PilhaString(){ // default
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

    public char peek(){
        return dados[topo - 1];
    }
    public void push(char i){
        dados[topo++] = i; //inserir para depoois somar
    }

    public char pop(){

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


