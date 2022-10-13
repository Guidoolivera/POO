package Clase19Excepciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Excepción: es un evento ocurrido al generarse un error en un programa
        durante el tiempo de ejecución.
        try: colocamos dentro aquellas instrucciones candidatas a fallar.
        catch: establecer que si ocurre una excepción de determinado tipo,
        ponemos un nombre, y realizamos alguna lógica particular.
        finally: se realiza indefectiblemente si existió o no una excepción.

        throw:
         */

        int x = 10;
        int y, z;
        System.out.println("Ingrese el valor de y; ");
        Scanner s = new Scanner(System.in);
        try {
        y = s.nextInt();
        z= x / y;
        System.out.println("Resultado: " + z);
        }
        catch (Exception ex) {
        System.out.println("Ocurrió un error.");
        }
        finally {
            System.out.println("Adiós!");
        }
        System.out.println("Adiós, nuevamente!");
    }
}
