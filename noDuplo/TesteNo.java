public class TesteNo {
    public static void main(String[] args) {
        Noduplo No1= new Noduplo(10);
        Noduplo No2 = new Noduplo(20);
        System.out.println("No1 " + No1);
        System.out.println("No2 " + No2 );

       ListaDupla ld = new ListaDupla();
       ld.inserirNovoNoInicio(34);
       ld.insereFim(50);
       System.out.println(ld);
       ld.inserirNovoNoInicio(34);
       ld.insereFim(25);
       System.out.println(ld);
    }
}
