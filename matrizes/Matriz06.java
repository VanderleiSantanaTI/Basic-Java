import java.util.Scanner;
public class Matriz06 {
    public static void main(String[] args) {
        Scanner entrar = new Scanner(System.in);
        int ordem = 5;
        int somaTotal = 0, demais=0;
        int matriz[][] = new int [ordem][ordem];
        int i, j;

        for (i = 0; i < ordem; i++){
            for (j =0 ; j < ordem; j++){
                System.out.print("Digite um numero matriz: ");
                matriz[i][j] = entrar.nextInt();
                while (matriz[i][j] != 0 && matriz[i][j] != 1) {
                    System.out.print("Digite um numero matriz: ");
                    matriz[i][j] = entrar.nextInt();
                }

             
            }
        }
        for (i = 0; i < ordem; i++){
            for (j =0 ; j < ordem; j++){
                if (i==j){
                    somaTotal += matriz[i][j];
                }
                else{
                    demais += matriz[i][j];
                }
                
                
            }
        }
        /*bool identidade = true;
        for (i = 0; i < ordem; i++){
            for (j =0 ; j < ordem; j++){
                identidade = identidade && ((i==j && matriz[i][j]==1) || (i!=j && matriz[i][j]==0));           
                
            }
        }*/
        if (somaTotal==ordem && demais==0){
            System.out.println("identidade"); 
        }

    }
} 
        
     