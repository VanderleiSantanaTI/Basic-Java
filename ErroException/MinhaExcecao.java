public class MinhaExcecao extends Exception {
    private int detalhe;

    MinhaExcecao(int a) {
        detalhe = a;

    }

    public String toString() {  // printa direto o objeto
        return "MinhaExcecao(" + detalhe + ")";
    }
} 

    

