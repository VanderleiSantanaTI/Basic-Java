public class TesteNo2 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 2000);
        Pessoa p2 = new Pessoa("Gil", 2001);

        System.out.println("P1" + p1);
        System.out.println("P2" + p2);

        No2  no1 = new No2(p1);
        No2  no2 = new No2(p2);

        System.out.println("no1" + no1);
        System.out.println("no2" + no2);

        no1.setProxmo(no2);
        System.out.println("? " + no1.getProximo());
    }
}