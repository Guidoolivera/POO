package Clase21.EjercicioBancoHashSet;

public class Cliente {

    private String nombre;
    private String nroCuenta;
    private double Saldo;

    public Cliente(String nombre, String nroCuenta, double saldo) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        Saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", nroCuenta='" + nroCuenta + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return nroCuenta.equals(cliente.nroCuenta);
    }

    @Override
    public int hashCode() {
        return nroCuenta.hashCode();
    }
}
