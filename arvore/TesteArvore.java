public class TesteArvore {
    public static void main(String[] args) {
        ArvoreBinaria abb = new ArvoreBinaria();

        abb.insre(20);
        abb.insre(30);
        abb.insre(45);
        abb.insre(23);
        abb.insre(12);
        abb.insre(56);
        abb.insre(34);
        abb.insre(67);
        abb.insre(34);
        abb.insre(45);
        abb.insre(23);
        abb.insre(67);
        abb.insre(12);
        abb.insre(20);
        abb.insre(40);
    
        System.out.println(abb.emOrdem());
    }
    
}
