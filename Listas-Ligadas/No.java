/*
 * Criando u Nó
 */
public class No {
    private int info;
    private No proximo;

    // Construtor somente se houver informações para armazenar
    public No(int info) {
        setInfo(info); 
        setProximo(null); // Inicializa o próximo como nulo por boa praticas
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "[" + info + "] ->";
    }
    
    //pojo = plain old java object
    
}
