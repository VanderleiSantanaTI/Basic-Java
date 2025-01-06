import java.util.Scanner;

public class NumPositivo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[20];

        for (int i=0; i< vetor.length; i++){
            System.out.printf("Digitar o valor %d: ", i);
            double num = sc.nextDouble();
            vetor[i] = num;
        }
        imprimirPos(vetor);
        sc.close();
    }
    public static void imprimirPos(double[] vet)
     {
        for (int i=0; i< vet.length; i++){
            if (vet[i] >= 0 ){
               System.out.print(vet[i] + ", ");
            }
        }
    }
}

