package Clase18Interfaces;

public class PalomaMensajera extends Ave implements EnviadorDeMensaje{
    public void volarRapido(){
        System.out.print("Volando rápido...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println(" Lanzando papel que dice: ¡Vote por este Partido!");
    }
}
