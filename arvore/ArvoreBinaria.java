public class ArvoreBinaria {
    private No raiz;

    public boolean arvoreVazia() {
        return raiz == null;
    }

    public void insre(int i) {
        No novo = new No(i);
        if (arvoreVazia()) {
            raiz = novo;
        } else {
            insereRec(novo, raiz);
        }
    }

    private void insereRec(No novo, No atual) {
        if (novo.getInf() <= atual.getInf()) {
            if (atual.getEsquerdo() == null) {
                atual.setEsquerdo(novo);
            } else {
                insereRec(novo, atual.getEsquerdo());
            }
        } else {
            if (atual.getDireito() == null) {
                atual.setDireito(novo);
            } else {
                insereRec(novo, atual.getDireito());
            }

        }
    }


    public int maior(){
        if(arvoreVazia()) return -1;
        No aux = raiz;
        while(aux.getDireito() != null) aux = aux.getDireito();
        return aux.getInf();
    }

    public int menor(){
        No aux = raiz;
        if (arvoreVazia()) return 1;
        while (aux.getEsquerdo() != null) aux = aux.getEsquerdo();
        return aux.getInf();

    }

    public String emOrdem(){
        if (arvoreVazia()) return "arvore vazia";
        return emOrdemRec(raiz);
    }

    private String emOrdemRec(No atual) {
        if (atual != null) {
            return emOrdemRec(atual.getEsquerdo()) + " "
             + atual.getInf() + " " + emOrdemRec(atual.getDireito());
        }
        return "";
    }
}
