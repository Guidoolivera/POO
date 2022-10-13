package Clase16EjercicioPolimorfismo;

public class BicicletaElectrica extends Bicicleta{
    private final int potMax = 400;
    private int potencia;

    public BicicletaElectrica(String marca, int rodado, int cantKms, int potencia){
        super(marca,rodado,cantKms);
        this.potencia = potencia;
    }

    @Override
    public boolean cumpleRequisitos() {
        return this.potencia < potMax && super.cumpleRequisitos();
    }
}
