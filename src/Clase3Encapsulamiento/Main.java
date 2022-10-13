package Clase3Encapsulamiento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        Deberíamos tomar a ciertos atributos y métodos, que hagan a un tipo particular de
        objeto, y envolverlos o encapsularlos en una única unidad llamada clase. De esa forma
        favoreceríamos la reutilización en otros proyectos de ese tipo de dato.

        Los objetos deben mantener su integridad, es decir, ocultar sus detalles de
        implementación o su estado interno, para que nadie pueda cambiar así sin más.


        PRIVATE: permite visibilidad de los atributos o métodos solo para esa misma clase.

        PUBLIC: permite visibilidad de los atributos o métodos para todas las clases.
        */

        //-----------------------

        /*
        THIS: Se utiliza cuando el parámetro que se le pasa a un método, tiene el mismo nombre que el atributo que
        quiero utilizar o modificar. La palabra reservada "this" hace referencia al objeto.

        -----------------

        Método Constructor: nos permite construir un objeto, a la vez que le damos un estado inicial.
        * Java siempre coloca un constructor por defecto a cada clase, de manera implícita.
        El constructor se invoca cada vez que ponemos "new objetoX".
        * Los constructores no tienen tipo de retorno, ni siquiera "void".
        * SIEMPRE DEBEN LLAMARSE IGUAL QUE LA CLASE.
        * El constructor se ejecuta una sola vez en el ciclo de vida del objeto.
        *Colocar al menos un constructor, anula el que Java crea por defecto. Para poder construir objetos de maneras
        distintas, con más o menos parámetros, se utiliza la "SOBRECARGA DE CONSTRUCTORES".

        -----------------

        */

        Robot r1 = new Robot("Robito");
        System.out.println(r1.toString());
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombrePersona = s.nextLine();
        //Sobrecarga de métodos
        r1.saludar(nombrePersona);
        r1.saludar();

    }
}
