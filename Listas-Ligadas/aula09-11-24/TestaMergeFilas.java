public class TestaMergeFilas  {
    public static void main(String[] args) {
        Fila fila1 = new Fila();
        Fila fila2 = new Fila();

        // Adicionando pessoas na fila 1
        fila1.enfileira(new Pessoa("Alice", 1990));
        fila1.enfileira(new Pessoa("Carlos", 1985));

        // Adicionando pessoas na fila 2
        fila2.enfileira(new Pessoa("Bruna", 1992));
        fila2.enfileira(new Pessoa("Daniel", 1988));

        System.out.println("Fila 1 antes do merge:");
        System.out.println(fila1);

        System.out.println("Fila 2 antes do merge:");
        System.out.println(fila2);

        // Realizando o merge das filas
        Fila filaMerge = Fila.mergeFilas(fila1, fila2);

        System.out.println("Fila resultante após o merge:");
        System.out.println(filaMerge);

        // Verificando o estado das filas originais
        System.out.println("Fila 1 após o merge:");
        System.out.println(fila1);

        System.out.println("Fila 2 após o merge:");
        System.out.println(fila2);
    }
}
