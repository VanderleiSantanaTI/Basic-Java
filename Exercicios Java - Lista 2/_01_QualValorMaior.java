import java.util.Scanner;

public class _01_QualValorMaior 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//ENTRADA DE DADOS
		System.out.print("1 - Digite um numero inteiro: ");
		int num1 = scanner.nextInt();
		
		System.out.print("2 - Digite um numero inteiro: ");
		int num2 = scanner.nextInt();
		
		
		//TOMADA DE DECISAO
		if(num1 > num2)
		{
			System.out.println(num1 + " e maior que " + num2);
		}
		else
			if(num2 > num1)
			{
				System.out.println(num2 + " e maior que " + num1);
			}
			else
			{
				System.out.println(num2 + " e " + num1 + "sao iguais.");
			}
	}
}
