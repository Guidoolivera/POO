package Clase16EjercicioPolimorfismo;

public class Bicicleta {
    private final int cantKmsMax = 50;
    private String marca;
    private int rodado;
    private int cantKms;

    public Bicicleta(String marca, int rodado, int cantKms){
        this.marca = marca;
        this.rodado = rodado;
        this.cantKms = cantKms;
    }

    public boolean cumpleRequisitos(){
        return (cantKms < cantKmsMax);
    }
}
