public class TesteNo {

    public static void main(String[] args) {
        No no1 = new No(10);
        System.out.println(no1);

        No no2 = new No(30);
        no1.setProximo(no2);
        System.out.println(no1.getProximo());
        
        No no3 = new No(35);
        no2.setProximo(no3);
        System.out.println(no2.getProximo());

        no1.setProximo(no3);
        System.out.println(no1.getProximo());
    }
}