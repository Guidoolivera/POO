package Clase18Interfaces;

public class Person implements EnviadorDeMensaje{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Hablando con alguien para que vote por el Partido..." + mensaje);
    }
}
