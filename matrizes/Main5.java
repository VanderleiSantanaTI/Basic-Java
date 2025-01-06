import java.util.Scanner;

public class Main5 {

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
            
            if(numeros[i]>=0){
                System.out.println("Num positivo " + numeros[i]);
            }
       }
       
    sc.close();
}
}

