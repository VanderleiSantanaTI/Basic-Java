public class No2 {

private Pessoa info;
private No2 proximo;

public No2(Pessoa info){
    this.info = info;
}
public No2 getProximo(){
    return proximo;
}
public void setProxmo(No2 proximo){
    this.proximo = proximo;
}
public Pessoa getInfo(){
    return info;
}

@Override
public String toString(){
    // return "nome =" + nome + ", anoNascimento =" + anoNascimento;
    return "[" + info + "]";
}
}