package Clase17MetodosAbstractos;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2 * base + 2 * altura;
    }
}
