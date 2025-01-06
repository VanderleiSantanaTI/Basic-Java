import java.util.Scanner;

/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int limite=4;
        int numeros[] = new int[5];
        for (int i=0; i <= limite; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            numeros[i]=num;

        }
        for (int i=0; limite > i; limite--){
            System.out.print(numeros[limite] + ", ");
       }
       System.out.print(numeros[0] + "." );
    sc.close();
}
}

