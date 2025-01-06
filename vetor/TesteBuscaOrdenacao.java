import java.util.Scanner;

public class TesteBuscaOrdenacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NossoVetorDinamico v = new NossoVetorDinamico(20);
        v.preencheVetor(1);
        System.out.println("\nvetor gerado: " + v);
        System.out.print("\nDigite uma valor para busca : ");
        int x = sc.nextInt();
        int posicao = v.buscaSimples(x);

        if(posicao > 0){
            System.out.println("\na primeira ocorrencia de " + x + " esta na posicao " + posicao);
        
            System.out.println("\n" + x + " ocorrencia encontradas " + v.numeroOcorrencias(x) + " vez(es)" );

            System.out.println("\nas posicoes sao: "  + v.listaPosicoes(x));
        }
        else
        {
            System.out.println(x + " não encontrado");
        }


        

        /***********************A*************************/
        // Verificação antes de remover o valor da posição 10
        int posicaoRemover = 1;
        int valorRemovido = v.removerPosicao(posicaoRemover);
        System.out.println("removido : " + valorRemovido);
        /************************B*********************/
        System.out.println(v.removeElemento(x));
        

        /****************************************/
        v.bubblesort();
        System.out.println("\nvetor ordenado: " + v);
        if(v.buscaBinaria(x))
        {
            System.out.println("\nbusca binaria achou " + x);
        }
        else
        {
            System.out.println("\nbusca binaria nao achou " + x);
        }

        sc.close();
    }


}