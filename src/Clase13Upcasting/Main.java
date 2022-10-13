package Clase13Upcasting;

public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("Ford", "Mustang", "HFD643");
        Auto a1 = new Auto(true,"Toyota", "Prius", "GHJ25");
        Moto m1 = new Moto("Benelli", "TNT", "ASD412");

        /*
        UPCASTING: es el proceso de generalización. Permite no repetir y ahorrar código.
        Al generalizar, perdemos los métodos que sean específicos de la clase anterior que estábamos tratando.
        Generalizar implica tratar un objeto como si fuera de un tipo más alto en la jerarquía de herencia.
         */
        Concesionaria c = new Concesionaria();
        Vehiculo v2 = a1;

        c.agregarVehiculo(m1);
        c.agregarVehiculo(v1);
        c.agregarVehiculo(v2);

        System.out.println(c);

    }
}
