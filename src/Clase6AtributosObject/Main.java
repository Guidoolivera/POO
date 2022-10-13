package Clase6AtributosObject;

public class Main {
    public static void main(String[] args) {
        Motor m1 = new Motor("1234", 1.6, "Nafta");
        Auto auto1 = new Auto("ABC123", "Toyota", 2500000,"Gris", m1);
        System.out.println(m1);
        System.out.println(auto1);

        m1.setCilindrada(2.3);
        System.out.println(m1);
        System.out.println(auto1);
    }
}
