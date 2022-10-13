package Clase17MetodosAbstractos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figurasGeometricas = new ArrayList<FiguraGeometrica>();
        figurasGeometricas.add(new Rectangulo(10, 12, "rojo"));
        figurasGeometricas.add(new Circunferencia(3, "verde"));
        figurasGeometricas.add(new Rectangulo(4, 5, "azul"));
        figurasGeometricas.add(new Circunferencia(5, "rojo"));
        figurasGeometricas.add(new TrianguloEquilatero("Negro",4));

        for (FiguraGeometrica figura : figurasGeometricas){
            System.out.println(figura.perimetro());
        }
    }
}
