import java.util.Scanner;

public class Main7 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite=5;
        int cont = 0, contfora=0;
        int numeros[] = new int[limite];
        
        while (cont < limite) {
            
            System.out.print("Digite um numero vetor01: ");
            int num = sc.nextInt();
            
            if (num % 5 == 0){
                numeros[cont]=num;
                cont ++;
            }else{
            contfora++;
            }
       }
       
    System.out.print("vetor 01: ");
    for (int i=0; i < limite; i++){
        System.out.print(numeros[i]+" ");
    }

    System.out.println("");
    System.out.println("Quantidade de numeros nao divisiveis por 5: " + contfora);

    sc.close();
    }  
}

