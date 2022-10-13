package Clase14DownCasting;

import java.util.ArrayList;

public class Concesionaria {
   // private ArrayList<Moto> motos;
   // private ArrayList<Auto> autos;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(){
       this.vehiculos = new ArrayList<Vehiculo>();
    }

    public void agregarVehiculo(Vehiculo v){
        if (v instanceof Auto){
            ((Auto) v).prenderAire();
        }
        else if (v instanceof Moto)
        {
            ((Moto) v).hacerWheelie();
        }
        this.vehiculos.add(v);
    }

    @Override
    public String toString() {
        return "\nConcesionaria{" +
                "vehiculos=" + vehiculos +
                '}';
    }
}
