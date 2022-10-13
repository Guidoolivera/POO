package Clase18Interfaces;

public class Main {
    public static void main(String[] args) {
        /*
        Las interfaces nos permiten emular la herencia múltiple.
        Una interfaz es una especie de clase abstracta. Solo puede contener
        métodos abstractos. También constantes, pero solo estáticas y públicas.
        Cumplen conceptualmente con el tipo "es un/una".
        No pueden guardar atributos.
         */

        PartidoPolitico p1 = new PartidoPolitico();

        p1.agregarMensajero(new PalomaMensajera());
        p1.agregarMensajero(new TelefonoMovil());
        p1.agregarMensajero(new Person());
        p1.hacerCampania();

    }
}
