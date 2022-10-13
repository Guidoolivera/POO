package Clase18Interfaces;

import java.util.ArrayList;

public class PartidoPolitico {
    private ArrayList<EnviadorDeMensaje> mensajeros;

    public PartidoPolitico(){
        mensajeros = new ArrayList<EnviadorDeMensaje>();
    }

    public void agregarMensajero(EnviadorDeMensaje mensajero){
        this.mensajeros.add(mensajero);
    }

    public void hacerCampania(){
        for (EnviadorDeMensaje mensajero : mensajeros){ //por cada "mensajero" en la lista de "mensajeros", visto como un objeto de tipo EnviadorDeMensaje.
            mensajero.enviarMensaje("Vote por nostros!");
        }
    }
}
