package Clase16EjercicioPolimorfismo;

import java.util.ArrayList;

public class Taller {

    public int cantServiciosPosibles (ArrayList<Bicicleta> bicicletas){
        int i = 0;
        for (Bicicleta bici : bicicletas){
            if (bici.cumpleRequisitos()){
                i++;
            }
        }
        return i;
    }
}
