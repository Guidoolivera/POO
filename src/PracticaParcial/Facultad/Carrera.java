package PracticaParcial.Facultad;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Carrera {
    private String nombre;
    private LinkedList<Materia> coleccionMaterias;

    public Carrera(String nombre){
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedList<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }

    public String ordenarMaterias(){
        TreeSet<Materia> ordenarMaterias = new TreeSet<>(new ComparadorDeMaterias());

        for (Materia mat:coleccionMaterias
             ) {
            ordenarMaterias.add(mat);
        }

        return ordenarMaterias.toString();
    }

    public void agregarMaterias(Materia materia){
        this.coleccionMaterias.add(materia);
    }


}

class ComparadorDeMaterias implements Comparator<Materia>{

    @Override
    public int compare(Materia o1, Materia o2) {
        String nombre1 = o1.getNombre();
        String nombre2 = o2.getNombre();
        return nombre1.compareTo(nombre2);
    }
}

