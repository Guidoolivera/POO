package Clase11Colecciones;

public class Main {
    public static void main(String[] args) {
        Concesionaria c1 = new Concesionaria("Olivera Autos");
        //¡CUIDADO! ¡No olvidar instanciar la colección en el constructor!!!!

        c1.mostrarAutos();

        //c1.getAutos().add(new Auto("AFD153", "Azul"));
        //c1.getAutos().add(new Auto("JFD535", "Negro"));
        //c1.getAutos().add(new Auto("HJD341", "Gris"));

        c1.agregarAutos(new Auto("AFD153", "Azul"));
        c1.agregarAutos(new Auto("JFD535", "Negro"));
        c1.agregarAutos(new Auto("HJD341", "Gris"));
        c1.mostrarAutos();

        //Buscar en colecciones.
        Auto a = c1.buscarAuto("AFD153");
        if (a == null){
            System.out.println("No se encontró el auto.");
        }else {
            System.out.println("Se encontró: " + a);
        }


    }
}
