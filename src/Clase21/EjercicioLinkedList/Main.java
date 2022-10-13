package Clase21.EjercicioLinkedList;

import Clase4toString.Persona;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> paises = new LinkedList<String>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("México");
        paises.add("Perú");

        LinkedList<String> capitales = new LinkedList<String>();
        capitales.add("Madrid");
        capitales.add("Bogotá");
        capitales.add("DF");
        capitales.add("Lima");

        //System.out.println(paises);
        //System.out.println(capitales);

        //Para unir ambas listas, debemos crear un ListIterator.

        ListIterator<String> itPaises = paises.listIterator();
        ListIterator<String> itCapitales = capitales.listIterator();

        while (itCapitales.hasNext()){
            if (itPaises.hasNext()){
                itPaises.next();
            }
            itPaises.add(itCapitales.next());
        }

        System.out.println(paises);

        //Para eliminar las posiciones pares de la lista:
        itCapitales = capitales.listIterator(); //IMPORTANTE REINICIALIZAR EL ITERADOR, PARA VOLVER AL INDICE 0.

        while (itCapitales.hasNext()){
            itCapitales.next();
            if (itCapitales.hasNext()){
                itCapitales.next();
                itCapitales.remove();
            }
        }
        System.out.println(capitales);

        //Para remover las capitales actuales de la linkedList que contiene paises y capitales:
        paises.removeAll(capitales);
        System.out.println(paises);
    }
}
