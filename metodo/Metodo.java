import java.util.Scanner;
public class Metodo{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um lavor: ");
        int n = entrada.nextInt();
        verificarValor(n);
        entrada.close();
    }
    public static void verificarValor(int num){
         
        if (num % 2 == 0){
            System.out.println("Valor e par");
        }else{
            System.out.println("Valor e impar");
        }
    }
}