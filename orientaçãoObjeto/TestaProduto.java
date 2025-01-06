public class TestaProduto {
    public static void main(String[] args) {
        Produtos pr = new Produtos();
        Produtos pro = new Produtos("oi ");
        pr.setDescricao("voce");
        System.out.println(pr.getDescricao());
        Produtos pro2 = new Produtos("o");
        System.out.println(pr.getDescricao());
        Produtos pro3 = new Produtos(3);

        pro.mostrarDescicaoProduto();
        pro2.mostrarDescicaoProduto();
        pro3.mostrarDescicaoProduto();
        
    }
}
