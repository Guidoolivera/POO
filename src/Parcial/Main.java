package Parcial;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        //Producto p2 = new NoPerecedero("azúcar", 20, "Comida");
        Producto p1 = new Perecedero("papa", 10, 1);
        productos.add(p1);
        //productos.add(p2);

        for (Producto producto : productos){
            if (producto instanceof Perecedero){
                System.out.println(((Perecedero)producto).calcular(5));
            }
            else if (producto instanceof NoPerecedero){
                System.out.println(((NoPerecedero) producto).calcular(5));
            }
            else {
                System.out.println(producto.calcular(5));
            }
        }

    }
}
