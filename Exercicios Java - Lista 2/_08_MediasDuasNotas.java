import javax.swing.JOptionPane;

public class _08_MediasDuasNotas 
{
	public static void main(String[] args)
	{
		//ENTRADA DE DADOS
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Primeira Nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Segunda Nota:"));
		
		//TOMA DE DECISAO
		if(nota1 >= 0  && nota2 >=0 && nota1 <= 10 && nota2 <= 10)//NOTAS >= 0 E <= 10
		{
			double media = (nota1 + nota2) / 2;
			
			JOptionPane.showMessageDialog(null, "Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMedia: " + media );
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Notas devem ser maior ou igual 0 e menor ou igual a 10");
		}
		
	}
}