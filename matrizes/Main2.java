import java.util.Scanner;

/**
 * main
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int limite=5;

        int numeros[] = new int[5];
        for (int i=0; i < limite; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            numeros[i]=num;

        }
        for (int i=0; i < limite; i++){
            numeros[i] = numeros[i]*3;
            System.out.println(numeros[i]);
       }
       
      
    sc.close();
}
}

