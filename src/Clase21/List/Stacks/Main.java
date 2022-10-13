package Clase21.List.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
        STACK o PILA: un objeto arriba del otro. Se diferencian de las otras LISTS por su forma de acceder a un objeto.
        Los objetos se apilan uno encima de otro, y para acceder a uno de ellos, debo recorrer sus objetos anteriores.
        Funcionan como LIFO.

         */
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacía: " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());

        //Agregar elementos:
        pila.push(1);
        pila.push(3);
        pila.push(3);
        pila.push(4);
        pila.push(7);
        pila.push(6);

        //Recorrer la pila
        for (Integer elementoPila : pila){
            System.out.println(elementoPila);
        }

        //Mostrar
        System.out.println("Pila: " + pila);
        System.out.println("La pila está vacía?: " + pila.isEmpty());

        pila.pop(); //ELIMINA el último registro que entró a la pila.
        System.out.println("Está el numero 3?: " + pila.search(3)); //no funciona igual con otros elementos...
        System.out.println("Último agregado: " + pila.peek());

    }
}
