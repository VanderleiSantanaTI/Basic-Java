//package teste;

public class DadosExcecao extends Exception {

    private String dado;

    public DadosExcecao(String dado_e) {
        this.dado = dado_e;
    }
    public String toString() {
        return "O dado '" + this.dado + "' não é um nome. Digite um nome.";
    }
}