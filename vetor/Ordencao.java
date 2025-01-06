import java.util.Date;
import java.util.Scanner;


public class Ordencao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        NossoVetor v;
        

        System.out.print("Digite o tamanho do vetor, 0 encerra: ");

        t = scanner.nextInt();

        while(t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            //System.out.print("\nvetor gerado " + v);
            System.out.print("\nordenando...");
            long inicio = new Date().getTime();
            v.bubblesort();
            long fim = new Date().getTime();
            System.out.print("tamanha " + t + ", " + (fim - inicio) + "ms");
            //System.out.print("\nvetor ordenado: " + v);
            System.out.print("\nDigite o tamanho do vetor, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
    
}
