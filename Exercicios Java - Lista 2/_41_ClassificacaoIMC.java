import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class _41_ClassificacaoIMC 
{
	public static void main(String[] args)
	{
		//ENTRADA DE DADOS
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Sua Altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Seu Peso:"));
		
		double imc = peso / altura;
		
		//UTILIZA SOMENTE 2 CASAS DEPOIS DA VIRGULA
		DecimalFormat formato = new DecimalFormat("#0.00");
		
		//TOMA DE DECISAO
		if(imc < 18.5 )//IMC ABAIXO DO PESO
		{
			JOptionPane.showMessageDialog(null, "Altura: " + altura + " m\nPeso: " + peso + " kg\nIMC: " + formato.format(imc) + " (Abaixo do Peso)" );
		}
		else
			if(imc > 18.6 && imc < 24.9)//IMC SAUDAVEL
			{
				JOptionPane.showMessageDialog(null, "Altura: " + altura + " m\nPeso: " + peso + " kg\nIMC: " + formato.format(imc) + " (Saudavel)" );
			}
			else
				if(imc > 25.0 && imc < 29.9)//IMC PESO EM EXCESSO
				{
					JOptionPane.showMessageDialog(null, "Altura: " + altura + " m\nPeso: " + peso + " kg\nIMC: " + formato.format(imc) + " (Peso em Excesso)" );
				}
				else
					if(imc > 30.0 && imc < 34.9)//IMC OBESIDADE GRAU I
					{
						JOptionPane.showMessageDialog(null, "Altura: " + altura + " m\nPeso: " + peso + " kg\nIMC: " + formato.format(imc) + " (Obesidade Grau I)" );
					}
					else
						if(imc > 35.0 && imc < 39.9)//IMC OBESIDADE GRAU II - SEVERA
						{
							JOptionPane.showMessageDialog(null, "Altura: " + altura + " m\nPeso: " + peso + " kg\nIMC: " + formato.format(imc) + " (Obesidade Grau II - Severa)" );
						}
						else //IMC OBSIDADE GRAU III - MORBIDA
						{
							JOptionPane.showMessageDialog(null, "Altura: " + altura + " m\nPeso: " + peso + " kg\nIMC: " + formato.format(imc) + " (Obesidade Grau III - Severa)" );
						}
		
	}
}