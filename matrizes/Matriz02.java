import java.util.Scanner;

public class Matriz02 {
    public static void main(String[] args) {
        int matrizA[][] = new int [2][2];
        int matrizB[][] = new int [2][2];
        int matrizC[][] = new int [2][2];
        int i, j;
       

        Scanner entrar = new Scanner(System.in);

        for (i = 0; i < 2; i++){
            for (j =0 ; j < 2; j++){
                System.out.print("Digite um numero matriz A: ");
                matrizA[i][j] = entrar.nextInt();
               
            }
        }
        
        for (i = 0; i < 2; i++){
            for (j =0 ; j < 2; j++){
                System.out.print("Digite um numero matriz B: ");
                matrizB[i][j] = entrar.nextInt();
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for (i = 0; i < 2; i++){
            for (j = 0 ; j < 2; j++){
                System.out.print(matrizC[i][j] + "  |  ");
                
            }
            System.out.println("");
        }
       

    }
}