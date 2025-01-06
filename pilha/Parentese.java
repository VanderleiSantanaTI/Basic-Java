package pilha;

import java.util.Scanner;

public class Parentese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua expressao");
        String expressao = sc.nextLine();
        PilhaString p = new PilhaString(expressao.length());
        boolean estaCerta = true;
        int i = 0;
        while ((i< expressao.length() && estaCerta)) {
            char letra = expressao.charAt(i++);
            if(letra == '('){
                p.push(letra);
            }else{
                if(p.estarVazia()) estaCerta = false;
                else p.pop();
            }
        }
        if(estaCerta && p.estarVazia()){
            System.out.println("Expressao correta");
        }else{
            System.out.println("Expressao incorreta");
        }

        sc.close();
    }
    
}
