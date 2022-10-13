package Clase8ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
    Es una de las colecciones que provee el lenguaje, se basa en la implementación de un Array, pero
    de forma dinámica.
        Creamos una variable de tipo "LISTA", pero dentro de ella debemos definir el "tipoDeDato".
        Debemos importar la clase ArrayList.
     */

        ArrayList<Auto> misAutos = new ArrayList<Auto>(); //Variable misAutos, de la clase ArrayList, de tipo Auto.

        System.out.println(misAutos.size());
        System.out.println(misAutos);
        System.out.println("--------------------");

        Auto a1 = new Auto("ABC123", "Azul");

        misAutos.add(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        System.out.println("--------------------");

        misAutos.add(new Auto("AXF255", "Cyan"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        System.out.println("--------------------");

        misAutos.add(new Auto("HDD355", "Azul"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        //Cómo obtener un auto conociendo su índice.
        System.out.println("--------------------");
        System.out.println("El segundo auto de la lista es: " + misAutos.get(1));
        //A .get se le pasa el índice del auto que queremos.

        //Para mostrar uno por uno los elementos de la lista.
        for (int i = 0; i < misAutos.size(); i++){
            System.out.println("El auto en la posición " + i + "es: " + misAutos.get(i));
        }


        //Para borrar un elemento de la lista.
        System.out.println("--------------------");

        misAutos.remove(2);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        //.clear nos permite remover todos los elementos de la lista.
        //.indexOf conociendo la referencia del objeto, nos devuelve un entero con el índice donde está colocado.

        System.out.println("\nUso de indexOf, donde esta el auto a1:");
        System.out.println(misAutos.indexOf(a1));

        //isEmpty pregunta si está vacía, devuelve un booleano.
    }

}
