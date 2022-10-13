package Clase18Interfaces;

public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje{
    public void llamar(){
        System.out.print(" Llamando de manera molesta...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encenderDispositivo();
        llamar();
        System.out.println(" Hola!!!!!! Votá por nuestro partido!");
    }
}
