package Clase16EjercicioPolimorfismo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Taller t = new Taller();

        ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();
        bicicletas.add(new Bicicleta("MB", 29, 25));
        bicicletas.add(new Bicicleta("MB", 27, 55));
        bicicletas.add(new Bicicleta("OLMO", 29, 40));
        bicicletas.add(new BicicletaElectrica("Venzo",29, 30,450));
        bicicletas.add(new BicicletaElectrica("OX",27, 30,350));

        System.out.println("La cantidad de servicios posibles es: " + t.cantServiciosPosibles(bicicletas));
    }
}
