public class Produtos {
    //**********ATRIBUTOS***************** */
    private int cod;
    private String nome;
    private String descricao;
    private int quantProduto;


    //******************CONSTRUTORES***************************** */
    public Produtos() {

    }

    // contrutores com parametro
    public Produtos(String  des_pt){
        this.descricao = des_pt;

    }
    // contrutores com parametro
    public Produtos(int qt) {
        this.quantProduto = qt;
    }
    
    // ************GETTERs e SETTERs**************************** */

    public void setCod(int c) {
        this.cod = c;
    }

    public int getCod() {
        return this.cod;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setQuantProduto(int qt_p) {
        this.quantProduto = qt_p;
    }

    public int getQuantProduto() {
        return this.quantProduto;
    }
    //**********METODO************************** */
    // metodo
    public void mostrarDescicaoProduto(){
        System.out.println("descricao: " + this.descricao + " | quantidade : " + this.quantProduto);
    }

    //=========== USO DO toString ====================
            // serve para imprimir o objeto direto sem precisar de métudo
    @Override
    public String toString(){

        return "cod:" + this.cod + " |  Nome: " + this.nome + "\ndescricao : " + this.descricao + " |  quant: "
                + this.quantProduto;
    }
}


