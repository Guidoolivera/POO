package Clase21.EjercicioTreeSet;

import java.util.Comparator;
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
        Articulo tercero = new Articulo(3, "Este es el tercer articulo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(primero);
        ordenaArticulos.add(segundo);

        for (Articulo art : ordenaArticulos){
            System.out.println(art.getDescripcion());
        }

        /*
        //Comparando también cadenas:
        Articulo comparadorArticulos = new Articulo();
        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos); //Con esto le decimos al programa
        //que en este TreeSet, los objetos se van a almacenar ordenados según lo que marque el objeto de tipo Compare (comparadorArticulos);

         */

        ComparadorArticulos compara_art = new ComparadorArticulos();
        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(compara_art);
        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercero);

        for (Articulo art : ordenaArticulos2){
            System.out.println(art.getDescripcion());
        }
    }
}


class Articulo implements Comparable<Articulo>/*, Comparator<Articulo>*/ {

    private int numero_articulo;
    private String descripcion;

    public Articulo (int num, String desc){
        numero_articulo = num;
        descripcion = desc;
    }
    /*
    public Articulo(){

    }

     */

    public String getDescripcion(){
        return descripcion;
    }

    @Override
    public int compareTo(Articulo o) {
        return numero_articulo - o.numero_articulo;
    }
/*
    @Override
    public int compare(Articulo o1, Articulo o2) {
        String descripcionA = o1.getDescripcion();
        String descripcionB = o2.getDescripcion();

        return descripcionA.compareTo(descripcionB);
    }

 */
}

class ComparadorArticulos implements Comparator<Articulo>{

    @Override
    public int compare(Articulo o1, Articulo o2) {
        String desc1 = o1.getDescripcion();
        String desc2 = o2.getDescripcion();
        return desc1.compareTo(desc2);
    }
}