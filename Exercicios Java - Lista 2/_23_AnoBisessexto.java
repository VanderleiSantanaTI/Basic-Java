import javax.swing.JOptionPane;

public class _23_AnoBisessexto 
{
    public static void main(String[] args) 
    {
    	//ENTRADA DE DADOS
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Ano:"));

        //REGRAS PARA SER ANO BISSEXTO
        boolean bissexto = (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));

        //TOMADA DE DECISAO
        if (bissexto) //SE FOR BISSEXTO
        {
        	JOptionPane.showMessageDialog(null, ano + " e Um Ano Bissexto.");
        } 
        else //NAO E BISSEXTO
        {
        	JOptionPane.showMessageDialog(null, ano + " Nao e Um Ano Bissexto.");
        }
    }
}