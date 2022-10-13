package PracticaParcial.Facultad;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Guido", "Olivera", "2312");
        Profesor p1 = new Profesor("Facundo", "Uferer","111");
        Materia m1 = new Materia("Laboratorio", p1);
        Carrera c1 = new Carrera("TUP");
        Facultad f1 = new Facultad("UTN");

        m1.agregarEstudiante(e1);
        c1.agregarMaterias(m1);
        f1.agregarCarrera(c1);
        f1.mostrarCarreras();

    }
}
