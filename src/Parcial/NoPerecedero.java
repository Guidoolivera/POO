package Parcial;

public class NoPerecedero extends Producto{
    private String tipo;

    public NoPerecedero(String nombre, int precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
