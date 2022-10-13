package Clase11Colecciones2While;

public class Auto {
    private String patente;
    private String color;

    public Auto (String patente, String color){
        this.patente = patente;
        this.color = color;
    }
    @Override
    public String toString(){
        return "La patente es: " + patente + ". El color es: " + color;
    }

    public String getPatente() {
        return patente;
    }
}
