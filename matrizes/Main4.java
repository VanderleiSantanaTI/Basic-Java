import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int limite=5;
        int soma=0;
        int numeros[] = new int[5];
        for (int i=0; i < limite; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            numeros[i]=num;
        }
        for (int i=0; i < limite; i++){
            
            if(numeros[i]%2==1){
                soma = soma + numeros[i];
            }
       }
       System.out.println("A soma dos impares e " + soma);
    sc.close();
}
}

