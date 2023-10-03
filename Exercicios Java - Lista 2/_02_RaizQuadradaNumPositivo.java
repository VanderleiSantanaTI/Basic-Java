import java.util.Scanner;

public class _02_RaizQuadradaNumPositivo 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//ENTRADA DE DADOS
		System.out.println("Digite um numero para descobrir a raiz quadrada:");
		String numero = scanner.nextLine();
		
		//TOMADA DE DECISAO
		if(numero.charAt(0) == '-') //SER FOR NEGATIVO
		{
			System.out.println("O numero deve ser positivo");
		}
		else //SER FOR POSITIVO
		{
			double raizQuadrada = Math.sqrt(Double.parseDouble(numero));
			
			System.out.println("A raiz quadrada de " + numero + " e " + raizQuadrada);
		}
		
		scanner.close();
	}
}
