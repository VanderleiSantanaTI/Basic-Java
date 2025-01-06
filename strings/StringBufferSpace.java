public class StringBufferSpace {
    public static void main(String[] args) {
        StringBuffer nome = new StringBuffer("Ftec");
        nome.append(" Carapicuiba");
        nome.insert(1,"a");

        char array[] = " aula de String".toCharArray();
        nome.append(array,5,10);
        System.out.println("1- " + nome);
        

    }
}
     //  saída: 1- Fatec Carapicuiba de String
     //  completa no nome Ftec para fatec e concatena carapicuiba e a array