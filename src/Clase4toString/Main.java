package Clase4toString;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Guido", "Olivera", 21, false);
        Persona p2 = new Persona("Edgardo", "Olivera", 67, true);
        Persona p3 = new Persona("Juan", "Perez", 43, false);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
