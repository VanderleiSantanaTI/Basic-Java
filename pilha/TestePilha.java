
package pilha;
import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        Random random = new Random();
        do{
            if(random.nextBoolean()){
                if(!p.estarCheia()){

                    p.push(random.nextInt(10));
                }
            }else{
                if(!p.estarVazia()){
                System.out.println(p.pop() + "foi desempilhado");
            }
        }
        System.out.println(p);
        }while (!p.estarVazia());
    }
    
}
