import java.util.Scanner;
public class TrocarCaracter
{  
    public static void main(String[] args) 
    {
        String palavra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Palavra: ");
        palavra = scanner.nextLine();

        char[] caracter = new char[palavra.length()];

        for(int i = 0; i < palavra.length(); i++)
        {
           
            if(palavra.toLowerCase().charAt(i) == 'a')
            {
                caracter[i] = '*';
            }
            else
            {
                caracter[i] = palavra.charAt(i);
            }
        }

        System.out.println("Palvra com * no lugar da caracter 'a'");
        for(int i = 0; i < palavra.length(); i++)
        System.out.print(caracter[i]);
        scanner.close();
     }
}
