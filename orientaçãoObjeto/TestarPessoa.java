import java.util.Scanner;

public class TestarPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Data de nascimento: ");
        String nasc = sc.nextLine();
        System.out.print("Endereco: ");
        String end = sc.nextLine();
        
        Pessoa p1 = new Pessoa(nome, nasc, end);
        Pessoa p2 = new Pessoa();

        p1.imprimirPssoa();
        p2.imprimirPssoa();
        
       



        

        //Pessoa p3 = new Pessoa();
        
        //p3.dataNasc = "10/05/2000";
        //p3.endereco = "Rua ABC";
        //p3.imprimirPssoa(); // criando um objeto


        sc.close();
    }
}