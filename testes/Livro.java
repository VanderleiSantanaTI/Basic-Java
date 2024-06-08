

public class Livro {
    private int id;
    private String autor;
    private String titulo;
    private int ano_de_publicacao;
    private boolean emprestrado;

    public Livro(){}
    
    public Livro(int id, String ator, String tit, int ano, boolean empres){
        this.id = id;
        this.autor = ator;
        this.titulo = tit;
        this.ano_de_publicacao = ano;
        this.emprestrado = empres;
    }

    public Livro(int id, boolean empres){
        this.id = id;
        this.emprestrado = empres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno_de_publicacao() {
        return ano_de_publicacao;
    }

    public void setAno_de_publicacao(int ano_de_publicacao) {
        this.ano_de_publicacao = ano_de_publicacao;
    }

    public boolean isEmprestrado() {
        return emprestrado;
    }

    public void setEmprestrado(boolean empres) {
        this.emprestrado = empres;
    }

    public void imprimirLivro(){
        System.out.printf("id: %d\n", this.id);
        System.out.printf("autor: %s\n", this.autor);
        System.out.printf("titulo: %s\n", this.titulo);
        System.out.printf("ano: %d\n", this.ano_de_publicacao);
        System.out.printf("emprestrado: %b\n", this.emprestrado);

    }

}