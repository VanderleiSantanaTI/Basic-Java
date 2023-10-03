import java.util.Scanner;

public class _10_IMCHomemMulher 
{
	public static void main(String[] args) 
	{	
		double pesoIdeal, altura;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("IMC - Peso Ideal");
		
		//ENTRADA DE DADOS
		System.out.println("Digite F - Feminino ou M - Masculino");
		char opcao = scanner.nextLine().toUpperCase().charAt(0);
		//.toUpperCase() = TORNAR TODA A STRING EM LETRA MAIUSCULA
		//.charAt(0) = PEGA A PRIMEIRA POSICAO DO CARACTER DA STRING
		
		//TOMADA DE DECISAO
		if (opcao == 'F') //SE OPCAO FOR = 'F' (FEMININO)
		{
			//ENTRADA DE DADOS
			System.out.println("Digite a Sua Altura:");
			altura = scanner.nextDouble();
			
			//REALIZA A CONTA
			pesoIdeal = (62.1 * altura) - 44;
			
			//MENSAGEM
			System.out.println("Seu peso ideal seria: " + pesoIdeal + " kg.");
		
		}
		else 
			if(opcao == 'M') //SE OPCAO FOR = 'M' (MASCULINO)
			{
				//ENTRADA DE DADOS
				System.out.println("Digite a Sua Altura:");
				altura = scanner.nextDouble();
				
				//REALIZA A CONTA
				pesoIdeal = (72.2 * altura) - 58;
				
				//MENSAGEM
				System.out.println("Seu peso ideal seria: " + pesoIdeal + " kg.");
			}
				else //CARACTER INVALIDO NAO E 'F' OU 'M'
				{
					System.out.println("Opcao Invalida");
				}

		scanner.close();
	}
}