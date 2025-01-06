
public class TesteNossoVetor{

    public static void main(String[] args){
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(100);
        System.out.println("valor antes " + v1.getDados()[4]);

        v1.setPosicao(4,35);  // setar o valor 35 na posicao 4
        System.out.println("valor antes " + v1.getDados()[4]);

        System.out.println(v2.getDados()[4]);
        v1 = new NossoVetor(5);

        v1 = new NossoVetor(4);
        v2 = new NossoVetor(4);

        v1.somarUmVetor(v2); // v1 é o this, o que vai ser referenciado e o auxiliar seria o v2

        
        
    }
}

