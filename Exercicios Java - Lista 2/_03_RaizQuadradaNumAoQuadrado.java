import java.util.Scanner;

public class _03_RaizQuadradaNumAoQuadrado 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//ENTRADA DE DADOS
		System.out.println("Digite um numero real positivo para obter a raiz quadrada, caso negativo sera o numero ao quadrado");
		double numero = scanner.nextDouble();
		
		//TOMADA DE DECISAO
		if (numero >= 0) //SE O NUMERO FOR >= 0
		{
		    //CALCULA A RAIZ QUADRADA
		    double raizQuadrada = Math.sqrt(numero);
		    System.out.println("A raiz quadrada de " + numero + " e " + raizQuadrada);
		}
		else //SER O NUMERO FOR NEGATIVO
		{
		    //CALCULA O NUMERO AO QUADRADO
		    double numeroAoQuadrado = numero * numero;
		    System.out.println("O numero " + numero + " ao quadrado e " + numeroAoQuadrado);
		}
		
		scanner.close();
	}
}
