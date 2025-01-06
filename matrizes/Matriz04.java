import java.util.Scanner;

public class Matriz04 {
    public static void main(String[] args) {
        Scanner entrar = new Scanner(System.in);
        int ordem = 4;
        int matriz[][] = new int [ordem][ordem];
        
        int i, j;
       
        for (i = 0; i < ordem; i++){
            for (j =0 ; j < ordem; j++){
                System.out.print("Digite um numero matriz: ");
                matriz[i][j] = entrar.nextInt();
                if (!((i == j) || (i + j == ordem -1))){
                    matriz[i][j] = 0;    
                    }   
            }
        }
        for (i = 0; i < ordem; i++){
            for (j =0 ; j < ordem; j++){     
                if (matriz[i][j] == 0){
                    System.out.print( " " + "  |  "); 
                }else{
                    System.out.print( matriz[i][j] + "  |  ");
                }         
            }
        System.out.println("");
        }  
    entrar.close();    
    }
}
