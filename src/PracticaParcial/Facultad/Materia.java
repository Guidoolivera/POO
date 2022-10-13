package PracticaParcial.Facultad;

import java.util.LinkedList;

public class Materia {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<>();
    }

    public void agregarEstudiante (Estudiante estudianteNuevo){
        this.coleccionEstudiantes.add(estudianteNuevo);
    }

    public String getNombre() {
        return nombre;
    }

    /*

    public void eliminarEstudiante (int legajo){
        for (Estudiante estudianteAEliminar : coleccionEstudiantes){
            if ()
            this.coleccionEstudiantes.remove()
        }
    }

     */

    public void listarEstudiantes(){
        for (Estudiante estudiante : coleccionEstudiantes){
            System.out.println(estudiante);
        }
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }
}
