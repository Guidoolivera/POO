package Clase9UsoODependencia;

public class Main {
    public static void main(String[] args) {

        /*En las situaciones en las que una clase conoce la existencia de la otra, pero no necesariamente teniéndola como atributo,
        hablamos de una relación de "Uso o Dependencia".
        Es una relación débil.

        Como impresora usa a Documento, o depende de esa clase, se indica apuntando desde impresora con una flecha  y
        línea punteada hacia Documento
         */

        Impresora impresora1 = new Impresora();
        Documento doc1 = new Documento("\nESTE ES EL TITULO", "Este es el cuerpo.\nEste es el cuerpo.");

        impresora1.encender();
        impresora1.imprimir(doc1);
    }
}
