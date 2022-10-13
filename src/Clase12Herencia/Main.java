package Clase12Herencia;

public class Main {
    public static void main(String[] args) {
        /* La herencia es el mecanismo por el cual se logran reaprovechar
        los miembros de una (H. simple) o varias clases (H.Múltiple) ya existentes.
        También nos permite generalizar y evitar la repetición de código. Esto lo hacemos analizando
        los factores en común.
        Cada vez que una clase extiende a la otra, se está cumpliendo la relación (conceptualmente) "Es un",
        o "is-a". A diferencia de asociación, (has-a, relación débil.), esta es una relación de herencia.

        Las subclases heredan todos los miembros NO PRIVADOS de la superclase (excepto los constructores).

        Super: los constructores no se heredan.
        El constructor de cualquier clase invocará primero al constructor de su superclase.
         */

        Auto a1 = new Auto(true,"Toyota", "Prius", "GHJ25");
        Moto m1 = new Moto("Benelli", "TNT", "ASD412");
        a1.acelerar();
        System.out.println(a1.toString());



    }
}
