public class Matriz03 {
    public static void main(String[] args) {
        int ordem = 8;
        int matriz[][] = new int [ordem][ordem];
        
        int i, j;
       

        for (i = 0; i < ordem; i++){
            for (j =0 ; j < ordem; j++){
                if (i >= j){
                    matriz[i][j] = 1;
                    System.out.print( matriz[i][j] + "  |  "); 
                    
                } else{
                    matriz[i][j] = 0;
                    System.out.print( matriz[i][j] + "  |  "); 
                }      
            }
        System.out.println("");
        }      
    }
}
