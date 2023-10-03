import javax.swing.JOptionPane;

public class _17_AreaTrapezio 
{
	public static void main(String[] args)
	{
		//ENTRADA DE DADOS
		double baseMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Base Menor do Trapezio:"));
		double baseMaior = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Base Maior do Trapezio:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Altura do Trapezio:"));
		
		//TOMA DE DECISAO
		if(baseMenor > 0  && baseMaior > 0 && altura > 0) //SE BASE MAIOR, BASE MENOR E ALTURA > 0
		{
			double area = (baseMenor + baseMaior) * altura / 2;
			
			//MENSAGEM
			JOptionPane.showMessageDialog(null, "Base Menor: " + baseMenor + "\nBase Maior: " + baseMaior + "\nAltura: " + altura + 
					"\n\nArea do Trapezio: " + area);
		}
		else
		{
			//MENSAGEM
			JOptionPane.showMessageDialog(null, "Os Valores das Bases e a Altura Devem Ser Maior que 0.");
		}
		
	}
}
