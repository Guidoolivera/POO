package Clase21.EjercicioLibroHashCodeEquals;

public class Libro {
        private String titulo;
        private String autor;
        private int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    private String getDatos(){
        return "El título es: " + titulo + ". El autor es: " + autor + ". El ISBN es: " + ISBN;
    }

/*
    public boolean equals(Object obj) {
        if (obj instanceof Libro){
            Libro otro = (Libro) obj;
            if (this.ISBN == otro.ISBN){
                return true;
            }else return false;
        }
    return false;
    }

 */
    /*
    Podemos sobreescribir el método equals y hashCode mediante la IDE.
    Aquí debemos definir qué campos marcan la diferencia para que dos objetos sean distintos.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        return ISBN == libro.ISBN;
    }

    @Override
    public int hashCode() {
        return ISBN;
    }
}
