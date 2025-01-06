public class TesteFila2 {

    public static void main(String[] args) {
        Fila f = new Fila();
        System.out.println("fila" + f);

        Pessoa p;
        p = new Pessoa("Ana", 2000);
        f.enfileira(p);
        System.out.println("fila" + f);
        
        p = new Pessoa("Gil", 2001);
        f.enfileira(p);
        System.out.println("fila" + f);

        p = new Pessoa("Bia" , 1999);
        f.enfileira(p);
        System.out.println("fila" + f);
        f.desenfileira();

        System.out.println(f.desenfileira() + "foi atendido");
        System.out.println("fila: " + f);
    }
}