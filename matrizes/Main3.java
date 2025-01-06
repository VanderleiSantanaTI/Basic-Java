import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int limite=5;
        int numeros[] = new int[5];
        
        for (int i=0; i < limite; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            numeros[i]=num;
        }
        int maior=numeros[0];
        for (int i=0; i < limite; i++){
            
            
            if(numeros[i] > maior){
                maior = numeros[i];
            }
       }
       System.out.println("O maior numero e " + maior);
    sc.close();
}
}

