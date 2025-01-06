public class No {
    private int inf;
    private No esquerdo;
    private No direito;

    public No(int i) {
        this.inf = i;
    }

    public No getEsquerdo() {
        return this.esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public int getInf() {
        return inf;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    
}