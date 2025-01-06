import java.util.Scanner;

public class MetodoSoma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DIgitar um valor: ");
        int n1 = entrada.nextInt();
        System.out.print("DIgitar outro valor: ");
        int n2 = entrada.nextInt();

        calcularSoma(n1, n2);
        entrada.close();
    }

    public static void calcularSoma(int num1, int num2){
        int res = num1 + num2;
        System.out.println("A suma e " + res);
        return;
    }
    
}
