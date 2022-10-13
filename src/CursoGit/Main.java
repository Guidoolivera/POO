package CursoGit;

public class Main {
    public static void main(String[] args) {
        /*
        Al inicializar un repositorio de Git, se creará por defecto una rama o "branch" master,
        que es una cronología o línea de tiempo.
        Cada cambio en el proyecto queda guardado mediante un "commit". Una "captura" del proyecto.
        Es preferible tener varios commit específicos.
        Podemos abrir distintas ramas.
        Podemos fusionar dos ramas en una sola mediante "merge" (unir). Esto puede provocar conflictos a resolver.
        Repositorio remoto: gitHub nos permite compartirlos en internet.
        "Push" es hacer una copia exacta del repositorio local y alojarla en los servidores de github.
        En otra computadora, mediante el cliente de git instalado, se puede hacer un "clone". Que realiza
        una copia exacta del repositorio en la computadora local. "Pull" nos permite traer cambios.
        Mediante "fork" se puede copiar un repositorio de otro usuario en nuestra cuenta de github. Mediante
        "pull request" se le puede pedir a ese usuario actualizar los cambios hechos.

        -----

        git init //inicializa un repositorio vacío de git
        git add . //añade todos los archivos al escenario de git, que es el lugar donde git registrará los cambios.
        git remote add origin https://github.com/Guidoolivera/CursoDeJava.git //agregamos la dirección de nuestro
        repositorio remoto, solo se realiza una vez.
        git push -u origin master

        Luego de realizar cambios, nuevamente hacemos los pasos:
        git add .
        git commit -m "x"
        git push -u origin master
         */
    }
}
