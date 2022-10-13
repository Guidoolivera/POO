package Clase12Herencia;

public class Auto extends Vehiculo{
    private boolean tieneAire;

    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }

    public void prenderAire(){
        if (tieneAire){
            System.out.println("Prendiendo aire...");
        }else System.out.println("El auto no tiene aire!");
    }

}
