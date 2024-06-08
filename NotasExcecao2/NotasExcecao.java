//package teste;

public class NotasExcecao extends Exception {

    private double nota;

    public NotasExcecao(double nota_p) {
        this.nota = nota_p;
    }
    public String toString() {
        return "A nota " + this.nota + " nao pertence ao intervalo valido. As notas devem estar entre 0 e 10";
    }
}