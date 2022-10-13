package PracticaParcial.Facultad;

import java.util.Comparator;
import java.util.LinkedList;

public class Facultad {
    private String nombre;
    private LinkedList<Carrera> coleccionCarreras = new LinkedList<>();

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCarrera(Carrera carreraNueva){
        this.coleccionCarreras.add(carreraNueva);
    }

    public void mostrarCarreras(){
        for (Carrera carrera : coleccionCarreras){
            System.out.println(carrera);
        }
    }

    public boolean eliminarCarrera (String nombreCarrera){
       for (Carrera carreraAEliminar : coleccionCarreras){
           if (carreraAEliminar.getNombre().equals(nombreCarrera)){
               this.coleccionCarreras.remove();
               return true;
           }
       }
        return false;
    }
}

