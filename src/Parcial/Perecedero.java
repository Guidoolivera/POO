package Parcial;

public class Perecedero extends Producto{
    private int diasACaducar;

    public Perecedero(String nombre, int precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public double calcular(int cantProductos) {
        double total = super.calcular(cantProductos);
        double total1 = 0;
        switch (diasACaducar){
            case 1 : total1 =  total / 4;
            break;
            case 2 : total1 =  total / 3;
            break;
            case 3 : total1 = total / 2;
            break;
            default: break;
    }
    return total1;
    }
}
