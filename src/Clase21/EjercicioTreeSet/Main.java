package Clase21.EjercicioTreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> ordenaPersonas = new TreeSet<String>();

        ordenaPersonas.add("Juan");
        ordenaPersonas.add("Guido");
        ordenaPersonas.add("Pedro");
        ordenaPersonas.add("Diego");

        System.out.println(ordenaPersonas);

        //Al ser de tipo String, ya se ordena automáticamente.
        for (String persona : ordenaPersonas){
            System.out.println (persona);
        }

        Articulo primero = new Articulo(1, "Primer articulo");
        Articulo segundo = new Articulo(2, "Segundo articulo");
        Articulo tercero = new Articulo(3, "Tercer articulo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(primero);
        ordenaArticulos.add(segundo);

        for (Articulo art : ordenaArticulos){
            System.out.println(art.getDescripcion());
        }

    }
}
class Articulo implements Comparable<Articulo>{

    private int numero_articulo;
    private String descripcion;

    public Articulo (int num, String desc){
        numero_articulo = num;
        descripcion = desc;
    }

    public String getDescripcion(){
        return descripcion;
    }

    @Override
    public int compareTo(Articulo o) {
        return numero_articulo - o.numero_articulo;
    }
}
