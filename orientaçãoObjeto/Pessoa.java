public class Pessoa {
    private String nome;
    private String dataNasc;
    private String endereco;


    public Pessoa(){ 
        // metodos construtores sem parâmetros
        this.nome = "guilhermina";
        this.dataNasc = "12/10/2001";
        this.endereco = "Rua BBC";
    }
    public Pessoa(String n, String dat, String end){
        // metodos construtores com parâmetros
        this.nome = n;
        this.dataNasc= dat;
        this.endereco = end;
    }

    public void imprimirPssoa(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Data de nascimento: " + this.dataNasc);
        System.out.println("endereco: " + this.endereco);
    } 
}--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------




