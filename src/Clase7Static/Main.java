package Clase7Static;

import Clase6AtributosObject.Motor;

public class Main {
    public static void main(String[] args) {
        /*
        Al poner "static delante de una variable de instancia (ATRIBUTO), pasa a llamarse
        Variable de CLASE.

         */
        Auto a1 = new Auto("ABC123", "Toyota", 12500,"Gris");
        Auto a2 = new Auto("AXC332", "Toyota", 12000,"Azul");
        Auto a3 = new Auto("DGS348", "Toyota", 15000,"Verde");

        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());

        Auto.anularDescuento();
        System.out.println("");
        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
    }
}
