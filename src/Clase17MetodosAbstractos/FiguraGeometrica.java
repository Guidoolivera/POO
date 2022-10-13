package Clase17MetodosAbstractos;

public abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica(String color){
        this.color = color;
    }

    public abstract double perimetro(); //el método perímetro es demasiado abstracto.
    //Los metodos abstractos deben ser públicos.

}
