package Clase2.Comportamiento;

public class CuentaBancaria {
    String CBU;
    String alias;
    double saldo;

    public void mostrarDatos(){
        System.out.println("El CBU es " + CBU);
        System.out.println("El alias es " + alias);
        System.out.println("El saldo actual es " + saldo);
    }
    public double obtenerSaldo(){
        return saldo;
    }

    public void depositarSaldo(double monto){
        if (monto > 0)
        saldo += monto;
        else
            System.out.println("Erorr: Número negativo.");
    }

    public boolean saldoDisponible(double monto){
        return saldo >= monto;
    }

    public void extraer(double monto){
        if (saldoDisponible(monto)){
            saldo -= monto;
        }else System.out.println("Saldo insuficiente");
    }
}
