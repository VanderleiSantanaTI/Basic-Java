

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o id: ");
        int i_d = sc.nextInt();
        System.out.print("Digite o titulo: ");
        String ti = sc.nextLine();
        sc.nextLine();
        System.out.print("Digite o autor: ");
        String autr = sc.nextLine();
        System.out.print("digite o ano de publicação: ");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.print("'S' para status emprestado,\n'N' para nao.: ");
        String st = sc.nextLine();
        boolean status = false;

        if (st.toLowerCase() == "n"){
            status = true;
        }else{
            status = false;
        }

        Livro li = new Livro();
        li.setAutor(autr);
        

        Livro l = new Livro(i_d, status);
        l.imprimirLivro();
        System.out.println(li.getAutor());
    }
}
