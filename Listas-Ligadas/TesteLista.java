public class TesteLista {
    public static void main(String[] args) {
        ListaSimples l = new ListaSimples();
        System.out.println(l);
        l.inserirInicio(10);
        l.inserirInicio(20);
        l.inserirInicio(30);
        System.out.println("depois das inserercoes de inicio: ");
        System.out.println(l);
        l.inserirFim(15);
        l.inserirFim(25);
        l.inserirFim(35);
        System.out.println("depois das insercoes de fim: ");
        System.out.println(l);
    }
    
}
