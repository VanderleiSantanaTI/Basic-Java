import java.util.Scanner;

public class Matriz01 {
    public static void main(String[] args) {
        int numeros[][] = new int [4][4];
        int i, j;
        int soma =0;
        Scanner entrar = new Scanner(System.in);

        for (i = 0; i < 4; i++){
            for (j =0 ; j < 4; j++){
                System.out.print("Digite um numero: ");
                numeros[i][j] = entrar.nextInt();
            }
        }
        for (i = 0; i < 4; i++){
            for (j = 0 ; j < 4; j++){
                System.out.print(numeros[i][j]+ "  |  ");
                soma+=numeros[i][j];
            }
            System.out.println("");
        }
        System.out.println("A soma e : " + soma);

    }
}
