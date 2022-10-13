package Clase3.Encapsulamiento;

public class Robot {
    private String nombre;

    public Robot (String nombre){
        setNombre(nombre);
    }

    private void setNombre(String nombre){
        if (nombre != null)
        this.nombre = nombre;
        else System.out.println("Debe asignar un nombre.");
    }

    @Override
    public String toString() {
        return "Robot toString --> " + " El robot se llama " + nombre;
    }
    //Sobrecarga de métodos "saludar".
    public void saludar (String nombrePersona){
        System.out.println("Hola " + nombrePersona + ", soy " + this.nombre);
    }

    public void saludar (){
        saludar("desconocido");
    }
}
