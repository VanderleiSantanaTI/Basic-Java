import java.util.Random;

public class NossoVetorDinamico {
    int[] dados;
    int capacidade, ocupacao;

    public NossoVetorDinamico(int capacidade){
        dados = new int[capacidade];
        this.capacidade = capacidade; // uso do this para nao gerar ambiguidade
        ocupacao = 0;
    }

    public NossoVetorDinamico(){
        this(10);
    }
    public boolean estaCheio(){
        return ocupacao == capacidade;
            
    }

    public boolean estaVazio(){
        return ocupacao == 0;
    }

    private void redimensiona (int novaCapacidade){
        int[] temporario = new int[novaCapacidade];
        for(int i = 0; i< ocupacao; i++){
            temporario[i] = dados[i];
        }
        dados = temporario;
        capacidade = novaCapacidade;
    }

    public void add (int e){
        if (estaCheio()){
            redimensiona(capacidade*2);

        }
        dados[ocupacao++] = e;
    }

    public int remove(){
        int e = dados[--ocupacao];
        if(capacidade >= 10 && ocupacao <= capacidade/4){
            
            redimensiona(capacidade/2);
        }
        return e;
    }

    public void preencheVetor(int espalhamento){ 
        Random r = new Random();
        for (int i = 0; i < capacidade; i++){
            dados[i] = r.nextInt(capacidade * espalhamento);
        }
        ocupacao = capacidade;
    }

    public int buscaSimples(int x){
        for(int i=0; i< ocupacao; i++){
            if(x==dados[i]){
                return i+1;
            }
        }
        return -1;
    }

    public boolean buscaBinaria(int x)
    {
        int ini = 0, fim = ocupacao -1;

        while(ini <= fim)
        {
            int meio = (ini + fim) / 2;

            if(x == dados[meio])
            {
                return true;
            }
            if(x > dados[meio])
            {
                ini = meio + 1;
            }
            else
            {
                fim = meio - 1;
            }
        }
        return false;
    }

    public int numeroOcorrencias(int x){
        int cont = 0;
        for(int i =0; i < capacidade; i++){
            if(dados[i]==x){
                cont++;
            }
        
        }
        return cont;
    }

    public void bubblesort(){
        for (int i=1; i< ocupacao; i++){
            for(int j = 0 ;j < ocupacao - i; j++){
                if(dados[j] > dados[j+1]){
                int aux = dados[j];
                dados[j] = dados[j+1];
                dados[j+1] = aux;
                
                }
            }
        }
    } 

    @Override
    public String toString(){
        String s = "";
        for(int i=0; i<ocupacao; i++){
            s += dados[i] + " ";
        }
        return s;
    }

    public NossoVetorDinamico listaPosicoes(int x)
    {
        NossoVetorDinamico posicoes = new NossoVetorDinamico();
        for(int i = 0; i< ocupacao; i++)
        {
            if(dados[i] == x)
            {
                posicoes.add(i + 1);
            }
        }
        return posicoes;
    }

    /*******************A*************************/
    public int removerPosicao(int val){

        // Verifica se a posição é válida
        if (val < 0 || val >= ocupacao) {
            
        // Retorna -1 se a posição não estiver ocupada
            return -1; 
        }

        int elementRemovido = dados[val];
        
        for (int i = val; i < ocupacao-1; i++){
        
            dados[i] = dados[i + 1];
        }
        ocupacao--;

        // Verifica se precisa redimensionar p/ reduzir o tamanho
        if (capacidade >= 10 && ocupacao <= capacidade / 4) {
            redimensiona(capacidade / 2);
        }

        return elementRemovido;
    }
    
    /*******************B*************************/
    public boolean removeElemento(int val) {
        // Busca a primeira ocorrência do elemento
        int posicao = buscaSimples(val);
    
        // Se a posição for -1, o elemento não foi encontrado
        if (posicao == -1) {
            return false; 
        }

        //buscaSimples retorna a posição +1
        removerPosicao(posicao - 1); // ja redimenciona
        
        return true; // Retorna true indicando sucesso na remoção
    }
}
    

