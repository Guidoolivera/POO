package Clase11Colecciones2While;

import java.util.ArrayList;
import java.util.Iterator;

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
/*
    //Buscar en una colección
    public Auto buscarAuto(String patente){
        Auto autoEncontrado = null;
        int i = 0;
        while (i < cantidadAutos() && autoEncontrado == null){
            Auto auto = this.autos.get(i);
            System.out.println("Viendo el auto: " + auto.getPatente());
            if (auto.getPatente().equalsIgnoreCase(patente)){
                autoEncontrado = auto;
                break;
            }
            i++;
        }
        return autoEncontrado;
        */

    public Auto buscarAuto(String patente){
        Auto autoEncontrado = null;
        int i = 0;
        while (i < cantidadAutos() && !this.autos.get(i).getPatente().equalsIgnoreCase(patente)){
            System.out.println("Viendo el auto: " + this.autos.get(i));
            i++;
    }
        if (i < cantidadAutos()){
            autoEncontrado = this.autos.get(i);
        }
        return autoEncontrado;
    }

    public Auto nBuscarAuto(String patente){
        Auto autoEncontrado = null;
        Iterator<Auto> it = this.autos.iterator();
        while (it.hasNext() && autoEncontrado == null){
            Auto a = it.next();
            if (a.getPatente().equalsIgnoreCase(patente)){
                autoEncontrado = a;
            }
        }
        return autoEncontrado;
    }
}