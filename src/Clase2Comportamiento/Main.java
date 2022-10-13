package Clase2Comportamiento;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        /*System.out.println(cb.CBU + " " + cb.alias + " " + cb.saldo + " " );
        cb.CBU = "12310234124124";
        cb.alias = "miCuenta";
        System.out.println(cb.CBU + " " + cb.alias + " " + cb.saldo + " " );

         */

        //cb.mostrarDatos();
        cb.CBU = "12310234124124";
        cb.alias = "miCuenta";
        cb.mostrarDatos();

        //Consultar cuanto saldo hay disponible.
        System.out.println("\nEl saldo obtenido es " + cb.obtenerSaldo());
        cb.depositarSaldo(155.90);
        System.out.println("\nEl saldo obtenido es " + cb.obtenerSaldo());

        //consultar saldo disponible mediante método booleano.
        System.out.println(cb.saldoDisponible(150));
        System.out.println(cb.saldoDisponible(300));

        //Extraer dinero de la cuenta.
        System.out.println(cb.obtenerSaldo());
        cb.extraer(10.0);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(1000.0);
        System.out.println(cb.obtenerSaldo());
    }
}
