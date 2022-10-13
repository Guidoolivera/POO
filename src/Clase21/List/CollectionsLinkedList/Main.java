package Clase21.List.CollectionsLinkedList;

import Clase21.List.CollectionsArrayList.Persona;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        LINKEDLIST: son un tipo de clase especial de Clase21.Collections.
        Representan a una lista doblemente enlazada (ida y vuelta)-
        Permite duplicados.
        Mantiene el orden de inserción (FIFO).
        Manipulación más rápida.
        Puede ser tratada también como pila o cola.
        Permite hacer inserciones o eliminaciones al principio o al final de la colección,
        es por esto que se puede tratar como pila o cola.

        Los registros están relacionados entre sí en dos direcciones (anterior y siguiente), excepto
        el primer y último elemento.
        La ventaja respecto de los ArrayList, es que podemos agregar elementos al principio o al final.

        Cuando se elimina un elemento en una LinkedList, este elimina sus punteros hacia su elemento anterior y siguiente,
        mientras que esos elementos apuntarán a sus respectivos nuevos elementos (que apuntaba el elem. eliminado).

        Al trabajar con listas que debamos agregar y eliminar elementos, es conveniente utilizar un LinkedList.
         */


        //Inicializamos lista como un LinkedList. Los paréntesis hacen referencia a la construcción de un nuevo LinkedList.
        LinkedList<Persona> lista = new LinkedList<Persona>();

        //Para agregar objetos al final de la lista:

        lista.add(new Persona(1,"Guido",21));
        lista.add(new Persona(2,"Lucas",26));
        lista.add(new Persona(3,"Fulano",5));
        lista.add(new Persona(4,"Mengano",75));

        //Para agregar objetos al PRINCIPIO de la lista:
        lista.add(0, new Persona(5, "Sultano", 40));


        /*Las LinkedList no tienen un índice bien determinado como las ArrayList, por lo tanto
        conviene recorrerlas registro a registro con un foreach.
         */
        for (Persona persona : lista){
            System.out.println("Prueba: "+ persona.getNombre() +", " + persona.getEdad());
        }

        System.out.println("----");
        //Para eliminar un elemento: recorro el arreglo buscando una coincidencia.
        String nombreABorrar = "Fulano";
        for (Persona persona : lista){ //recorro el arreglo
            if (persona.getNombre().equals(nombreABorrar)){ //si el nombre de la persona = nombre a borarr...
                lista.remove(persona);   //remover el objeto.
                break;    //corto el bucle para poder seguir recorriendo el registro, ya que Java todavía no conoce las nuevas posiciones del arreglo.
            }
        }

        for (Persona persona : lista){
            System.out.println("Prueba: "+ persona.getNombre() +", " + persona.getEdad());
        }


        //Para conocer el tamaño de la lista tenemos el método size.
        System.out.println("Tamaño de la lsita: " + lista.size());
        //Exclusivo de LL: getFirst y getLast.
        System.out.println("Primero de la LinkedList" + lista.getFirst());
        System.out.println("Primero de la LinkedList" + lista.getFirst());
        //borrar toda la lista:
        lista.clear();
        //Comprobar si está vacía
        System.out.println("LinkedList está vacía? " + lista.isEmpty());


    }
}
