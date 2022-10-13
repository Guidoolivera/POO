package Clase15Abstract;

public class Main {
    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();
        Auto a1 = new Auto(true,"Toyota", "Prius", "GHJ25");
        Moto m1 = new Moto("Benelli", "TNT", "FJK255");

        /*
        Un vehículo es una concepción abstracta.
        En UML indicamos una clase abstracta con letra itálica.
        NO SE PUEDEN INSTANCIAR OBJETOS DE UNA CLASE ABSTRACTA.
        Sin embargo, que una clase sea abstracta no impide que tal tipo de dato
        aparezca en variables, parámetros o valores de retorno.
         */

        //Vehiculo v1 = new Vehiculo();


    }
}
