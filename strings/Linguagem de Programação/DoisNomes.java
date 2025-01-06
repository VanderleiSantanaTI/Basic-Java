import java.util.Scanner;

public class DoisNomes
{
    public static void main(String[] args) 
    {
        String[] nome = new String[2];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome 1: ");
        nome[0] = scanner.nextLine();

        System.out.print("Digite o nome 2: ");
        nome[1] = scanner.nextLine();

        System.out.println("Nome 1: " + nome[0] + " / Segunda letra: " + nome[0].charAt(1));
        System.out.println("Nome 2: " + nome[1] + " / Segunda letra: " + nome[1].charAt(1));

        scanner.close();
    }
}