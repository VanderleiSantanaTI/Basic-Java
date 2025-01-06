import java.util.Scanner;
public class QuantidadeVogais
{
    public static void main(String[] args) 
    {
        String nome;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();

        for(int i = 0; i < nome.length(); i++)
        {
            if((nome.toLowerCase().charAt(i) == 'a') || (nome.toLowerCase().charAt(i) == 'e') || (nome.toLowerCase().charAt(i) == 'i') || 
            (nome.toLowerCase().charAt(i) == 'o') || (nome.toLowerCase().charAt(i) == 'u'))
            {
                contador++;
            }
        }

        System.out.println("Nome : " + nome + " / quantidade de vogal: " + contador);

        scanner.close();
     }
}