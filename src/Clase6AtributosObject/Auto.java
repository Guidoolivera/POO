package Clase6AtributosObject;

public class Auto {
    private String patente;
    private String marca;
    private int precio;
    private String color;
    private Motor motor;

    public Auto(String patente, String marca, int precio, String color, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                '}';
    }
}
