package Clase13Upcasting;

public class  Moto extends Vehiculo {
    private int anchoDeManubrio;

    public Moto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    public void hacerWheelie(){
        System.out.println("Haciendo wheelie...");
    }
}
