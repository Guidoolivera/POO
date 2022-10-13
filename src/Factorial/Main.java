package Factorial;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
    public static int factorial(int numero){
        if (numero == 0){
            return 1;
        }else return numero * factorial(numero-1);

    }
}
