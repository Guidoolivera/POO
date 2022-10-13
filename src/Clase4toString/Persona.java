package Clase4toString;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean tieneHijos;

    public Persona(String nombre, String apellido, int edad, boolean tieneHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean tieneHijos() {
        return tieneHijos;
    }

    @Override
    public String toString() {
        return "Se llama: " + nombre + " " + apellido +
                "\nSu edad es " + edad + "años." +
                "\n ¿Tiene hijos? " + tieneHijos;
    }
}
