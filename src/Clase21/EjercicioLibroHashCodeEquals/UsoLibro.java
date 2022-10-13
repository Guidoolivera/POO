package Clase21.EjercicioLibroHashCodeEquals;

public class UsoLibro {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Prog", "Guido", 1234);
        Libro libro2 = new Libro("Prog", "Guido", 1234);

        //libro1 = libro2; //De esta manera tendrán el mismo hashCode;

        //Para hacer esto debemos sobreescribir el método equals, para que distinga el ISBN.
        if (libro1.equals(libro2)){
            System.out.println("Es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }
        else {
            System.out.println("No es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }

    }
}
