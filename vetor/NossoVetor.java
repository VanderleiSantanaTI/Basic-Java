import java.util.Random;

public class NossoVetor{
    static int cont=10; // funciona como um default

    //atributo encapsulado, vetor de inteiro
    private int[] dados;
    
    //construtores com sobrecargas como um valor padrao
    public NossoVetor(){
        this(10);
    }
    public NossoVetor(int capacidade){
        dados = new int[capacidade];
        cont ++;
    }
    public int[] getDados(){
        return dados;
    }
    public void setPosicao(int pos, int valor){
        dados[pos]=valor;
    }

    //alta coesão, baixo acoplamento: não precisa saper o tipo primitivo do vetor, so o obje
    public void somarUmVetor(NossoVetor aux){  // entrada do vetor
        for(int i=0; i < this.dados.length; i++){ // usa-se o 'this' para excluir a ambiguidade
                this.dados[i] += aux.dados[i];
        }
    }
    public static NossoVetor somaDoisVetores ( NossoVetor vA, NossoVetor vB){
        NossoVetor vResult = new NossoVetor(vA.dados.length);
        for (int i=0; i< vA.dados.length; i++){
            vResult.dados[i] = vA.dados[i] + vB.dados[i];
        }
        return vResult;
    }
    // assinatura = é publico é void e sobrescreve 
    public void preencheVetor(){ 
        Random r = new Random();
        for (int i = 0; i < dados.length; i++){
            dados[i] = r.nextInt(dados.length * 10);
        }
    }
    @Override
    public String toString(){
        String s = "";
        for(int i=0; i<dados.length; i++){
            s += dados[i] + " ";
        }
        return s;
    }
    public void bubblesort(){
        for (int i=1; i< dados.length; i++){
            for(int j = 0 ;j< dados.length - i; j++){
               if(dados[j] > dados[j+1]){
                int aux = dados[j];
                dados[j] = dados[j+1];
                dados[j+1] = aux;
                
               }
            }
        }
    } 
}
