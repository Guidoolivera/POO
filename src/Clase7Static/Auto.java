package Clase7Static;


public class Auto {
    private String patente;
    private String marca;
    private int precio;
    private String color;
    private static double dcto;


    public Auto(String patente, String marca, int precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        Auto.dcto = 10;
    }

    public double precioPromocional(){
        return this.precio - this.precio * dcto / 100;
    }
    public static void anularDescuento(){
        Auto.dcto=0;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}

