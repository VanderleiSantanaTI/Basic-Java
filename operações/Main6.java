import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int limite=5;

        int numeros[] = new int[limite];
        int numeros2[] = new int[limite];

        for (int i=0; i < limite; i++){
            System.out.print("Digite um numero vetor01: ");
            int num = sc.nextInt();
            numeros[i]=num;
        }
        for (int i=0; i < limite; i++){
            System.out.print("Digite um numero vetor02: ");
            int num = sc.nextInt();
            numeros2[i]=num;
        }

        int aux=0;
        int c=limite-1;
        for (int i=0; i < limite; i++){
            aux = numeros[i];
            numeros[i] = numeros2[c];
            numeros2[c] = aux;
            c--;
            
       }
        System.out.print("vetor 01: ");
        for (int i=0; i < limite; i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        
        System.out.print("vetor 02: ");
        for (int i=0; i < limite; i++){
            System.out.print(numeros2[i]+" ");
        }

    sc.close();
}
}

