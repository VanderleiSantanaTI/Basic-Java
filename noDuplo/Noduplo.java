
public class Noduplo {
    private int info;
    private Noduplo anterior;
    private Noduplo proximo;
    
    public Noduplo(int info){
        this.info =info;
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public Noduplo getAnterior() {
        return anterior;
    }
    public void setAnterior(Noduplo anterior) {
        this.anterior = anterior;
    }
    public Noduplo getProximo() {
        return proximo;
    }
    public void setProximo(Noduplo proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public String toString (){
        return "["+ info + "]";
    }
}