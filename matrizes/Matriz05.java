import java.util.Scanner;
public class Matriz05 {
    public static void main(String[] args) {
        Scanner entrar = new Scanner(System.in);
        int ordem = 5;
        int matriz[][] = new int [ordem][ordem];
        int i, j;
        for (i = 0; i < ordem; i++){
            for (j =0 ; j < ordem; j++){
                System.out.print("Digite um numero matriz: ");
                matriz[i][j] = entrar.nextInt();
            }
        }    
        for (i = 0; i < ordem; i++){
            for (j =0 ; j < ordem; j++){     
     
                if ((i + j)%2==0){
                    System.out.print( matriz[i][j] + "  |  "); 
                } else{
                    System.out.print( " " + "  |  "); 
                }      
            }
        System.out.println("");
        }
        entrar.close();      
    }
}
