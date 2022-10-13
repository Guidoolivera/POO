package Clase13Upcasting;

import java.util.ArrayList;

public class Concesionaria {
   // private ArrayList<Moto> motos;
   // private ArrayList<Auto> autos;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(){
       this.vehiculos = new ArrayList<Vehiculo>();
    }

    public void agregarVehiculo(Vehiculo v){
        System.out.println(v instanceof Vehiculo);
        this.vehiculos.add(v);
    }

    @Override
    public String toString() {
        return "\nConcesionaria{" +
                "vehiculos=" + vehiculos +
                '}';
    }
}
