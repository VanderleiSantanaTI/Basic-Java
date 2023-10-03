import java.util.Scanner;

public class _21_MenuOpcoes 
{
	public static void main(String[] args) 
	{
		double numero1, numero2, resultado;
		
		Scanner scanner = new Scanner(System.in);
		
		//CRIACAO DO MENU DE OPCAO
		System.out.println("Escolha a Opcao:");
		System.out.println("1 - Soma Dois Numeros.");
		System.out.println("2 - Diferenca de Dois Numeros. (Maior Pelo Menor)");
		System.out.println("3 - Produto Entre Dois Numeros.");
		System.out.println("4 - Divisao Entre Dois Numeros. (Denominador Nao Pode Ser 0)");
		System.out.print("Opcao... ");
		String opcao = scanner.nextLine();
		
		//ESCOLHER OPCAO
		switch(opcao)
		{
			case "1": //SOMA DOIS NUMEROS
				System.out.println("Soma Dois Numeros.\n");
				//ENTRADA DE DADOS
				System.out.print("Digite o Primeiro Numero: ");
				numero1 = scanner.nextDouble();
				System.out.print("Digite o Segundo Numero: ");
				numero2 = scanner.nextDouble();
				//REALIZA A SOMA
				resultado = numero1 + numero2;
				//MENSAGEM
				System.out.println(numero1 + " + " + numero2 + " = " + resultado);
				break;
			//============================================================================	
			case "2": //DIFERENCA DE DOIS NUMEROS
				System.out.println("Diferenca de Dois Numeros. (Maior Pelo Menor)\n");
				//ENTRADA DE DADOS
				System.out.print("Digite o Primeiro Numero: ");
				numero1 = scanner.nextDouble();
				System.out.print("Digite o Segundo Numero: ");
				numero2 = scanner.nextDouble();
				//TOMA DE DECISAO
				if(numero1 > numero2) //NUMERO1 MAIOR QUE NUMERO2
				{
					System.out.println(numero1 + " > " + numero2);
				}
				else
					if(numero2 > numero1) //NUMERO2 MAIOR QUE NUMERO1
					{
						System.out.println(numero2 + " > " + numero1);
					}
					else //NUMERO1 = NUMERO2
					{
						System.out.println(numero1 + " e " + numero2 + " sao iguais.");
					}
				break;
			//============================================================================
			case "3": //PRODUTO ENTRE DOIS NUMEROS
				System.out.println("Produto Entre Dois Numeros.\n");
				//ENTRADA DE DADOS
				System.out.print("Digite o Primeiro Numero: ");
				numero1 = scanner.nextDouble();
				System.out.print("Digite o Segundo Numero: ");
				numero2 = scanner.nextDouble();
				//PRODUTO DE NUMERO1 E NUMERO2
				resultado = numero1 * numero2;
				//MENSAGEM
				System.out.println(numero1 + " * " + numero2 + " = " + resultado);
				break;
			//============================================================================
			case "4": //DIVISAO ENTRE DOIS NUMEROS
				System.out.println("Divisao Entre Dois Numeros. (Denominador Nao Pode Ser 0)\n");
				//ENTRADA DE DADOS
				System.out.print("Digite o Primeiro Numero: (Numerador) ");
				numero1 = scanner.nextDouble();
				System.out.print("Digite o Segundo Numero: (Denominador) ");
				numero2 = scanner.nextDouble();
				if(numero2 > 0)//DENOMINADOR > 0
				{
					resultado = numero1 / numero2;
					//MENSAGEM
					System.out.println(numero1 + " / " + numero2 + " = " + resultado);
					
				}
				else
				{
					resultado = numero1 / numero2;
					//MENSAGEM
					System.out.println("O Denominador Deve Ser Maior Que 0.");
						
				}
				break;
			//============================================================================
			default: //OPCAO INVALIDA
				System.out.println("Opcao Invalida.");
				break;
		}
		
		scanner.close();
	}
}