package Clase14DownCasting;

public class Main {
    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();
        Auto a1 = new Auto(true,"Toyota", "Prius", "GHJ25");

        /*
        Para utilizar el downCasting, simplemente tengo que especificar de forma explícita, delante de la variable,
        el tipo de dato que queremos tratar al objeto en cuestión que estamos asignando. ¿A qué tipo de dato
        queremos "castear" o promocionar?
         */

        //DownCasting. "v1" es un objeto de tipo vehículo, promocionado o casteado a "Auto".
        Vehiculo v1 = a1;

        Auto a2 = (Auto) a1;
        //a2.prenderAire();//este método es propio de la clase Auto.

        c.agregarVehiculo(a2);
        c.agregarVehiculo(new Moto("Benelli", "TNT", "KGK244"));


    }
}
