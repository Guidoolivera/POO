package Clase21.List.CollectionsArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    /*
            LISTAS: conjunto de elementos relacionados entre sí, y que tienen un determinado
        orden. Hay dos tipos de orden: FIFO (First In First Out), LIFO (Last In First Out) (Stacks).
        Su tamaño es dinámico.
        Las tres más utilizadas son: ArrayList, LinkedList, Stack

        ARRAYLIST: es una clase que se representa como una matriz dinámica que permite almacenar distintos
        conjuntos de Arrays.
        Hereda de AbstractList, la cual implementa la interfaz List.
        Permite colecciones o elementos duplicados.
        El orden es FIFO (en el que son insertados)
        Permiten acceso aleatorio (gracias a su índice).
        Su manipulación es lenta a la hora de hacer cambios.

        Podemos utilizar el método (collection.sort()).
        ListIteratos modifica en cualquier dirección.
     */

        //Como todo en Java, tengo que declarar en inicializar mi ArrayList.
        List<Persona> lista;        //declaración de la Lista de nombre "lista", de tipo Persona
        lista = new ArrayList<Persona>();
        //Inicializamos lista como un ArrayList. Los paréntesis hacen referencia a la construcción de un nuevo ArrayList.
        //Para agregar objetos en la lista:
        lista.add(new Persona(1,"Guido",21));
        lista.add(new Persona(2,"Lucas",26));
        lista.add(new Persona(3,"Fulano",5));
        lista.add(new Persona(4,"Mengano",75));

        for (Persona persona : lista){
            System.out.println("Prueba: "+ persona.getNombre() +", " + persona.getEdad());
        }

        //Para eliminar un elemento conociendo el indice:
        lista.remove(3);

        for (Persona persona : lista){
            System.out.println("Prueba: "+ persona.getNombre() +", " + persona.getEdad());
        }


        //Para conocer el tamaño de la lista tenemos el método size.
        System.out.println("Tamaño de la lista: " + lista.size());
        //borrar toda la lista:
        lista.clear();
        //Comprobar si está vacía
        System.out.println("ArrayList está vacía? " + lista.isEmpty());
    }
}
