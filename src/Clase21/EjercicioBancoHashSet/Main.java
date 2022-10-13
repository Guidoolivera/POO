package Clase21.EjercicioBancoHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Cliente> clientesDelBanco = new HashSet<Cliente>();

        Cliente c1 = new Cliente("Guido", "0001", 25000);
        Cliente c2 = new Cliente("Juan", "0002", 4500);
        Cliente c3 = new Cliente("Fulano", "0003", 10000);
        Cliente c4 = new Cliente("Mengano", "0004", 250);
        Cliente c5 = new Cliente("Guido", "0001", 25000);

        clientesDelBanco.add(c1);
        clientesDelBanco.add(c2);
        clientesDelBanco.add(c3);
        clientesDelBanco.add(c4);
        clientesDelBanco.add(c5);//c5 tiene distinto hashCode que c1.
        /*c5 contendrá en el Stack, una referencia al Objeto Cliente que se guarda en el Heap.
        El hasCode es un número que hace referencia a la localización del objeto almacenado en el Heap.
        */


        //al ser HashSet, no aparecen ordenados.
        for (Cliente cliente : clientesDelBanco){
            System.out.println(cliente.getNombre() + " "+ cliente.getNroCuenta() + " " + cliente.getSaldo());
        }

        System.out.println("............ITERATOR.........");

        //Recorrer con iterador
        Iterator<Cliente> it = clientesDelBanco.iterator();

        while (it.hasNext()){
            String nombre_Cliente = it.next().getNombre();
            System.out.println(nombre_Cliente);
        }

        //Si quisiera eliminar un objeto de mi colección: supongamos, a Mengano...
        /*
       for (Cliente cliente : clientesDelBanco){
            if (cliente.getNombre().equals("Mengano")){ //no podemos modificar una colección a la vez que la recorremos. Para eso utilizamos el Iterator
                clientesDelBanco.remove(cliente);
            }
        }
         */

        Iterator<Cliente> it2 = clientesDelBanco.iterator();

        while (it2.hasNext()){
            String nombre_cliente = it2.next().getNombre();
            if (nombre_cliente.equals("Mengano")){
                it2.remove();
            }
        }

        System.out.println("\nMengano removido....\n");

        for (Cliente cliente : clientesDelBanco){
            System.out.println(cliente.getNombre() + " "+ cliente.getNroCuenta() + " " + cliente.getSaldo());
        }


    }
}
