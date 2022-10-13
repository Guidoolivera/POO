package Clase9UsoODependencia;

public class Impresora {

    private boolean estaEncendida;

    public void encender(){
        estaEncendida = true;
    }

    public void imprimir(Documento doc1){
        if (estaEncendida){
            System.out.println(doc1.getTitulo());
            System.out.println("---");
            System.out.println(doc1.getCuerpo());
            System.out.println("...");
        }
        else System.out.println("La impresora está apagada!");
    }
}
