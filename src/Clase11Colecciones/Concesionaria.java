package Clase11Colecciones;

import java.util.ArrayList;

public class Concesionaria {

    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<Auto>(); //ArrayList hereda de Collection, es decir que TODO ArrayList puede ser considerado una coleccion.
    }

    public void mostrarAutos(){
        if(autos.isEmpty()){
            System.out.println("No hay autos!");
        }else{
       /*
            for (int i = 0; i < autos.size(); i++){
                System.out.println(autos.get(i));
            }

        */
            for (Auto autoX : autos){ //Ciclo for each, recorre la coleccion de "autos", y guarda temporalmente cada elemento en la variable "autoX" de tipo Auto.
                System.out.println(autoX);
            }
        }
    }

    public void agregarAutos(Auto a){
        this.autos.add(a);
    }

    public int cantidadAutos(){
        return autos.size();
    }

    //Buscar en una colección
    public Auto buscarAuto(String patente){
        Auto autoEncontrado = null;
        for (Auto auto : autos){
            if (auto.getPatente().equalsIgnoreCase(patente)){
                autoEncontrado = auto;
            }
        }
        return autoEncontrado;
    }
}
