package Clase16Polimorfismo;

public class Main {
    public static void main(String[] args) {
        /*
        Existen 4 tipos distintos
        Por sobrecarga: métodos con el mismo nombre, pero distinta firma.
        Por coerción: forzar a un individuo para condicionar su comportamiento.
        Paramétrico: nos permite el desacople entre clases. Una sola clase ve a todos los tipos de datos de forma genérica.
        POLIMORFISMO POR HERENCIA = POLIMORFISMO. Permite enviar mensajes sintácticamente iguales a objetos de tipos
        distintos, cada uno con su propio comportamiento.

         */
        probrarVehiculo(new Avion());
        probrarVehiculo(new BicicletaElectrica());
        probrarVehiculo(new Vehiculo());
    }
    public static void probrarVehiculo(Vehiculo v){
        v.encender();
    }
}
