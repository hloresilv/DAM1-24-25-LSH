package ud3.ejercicios;

/*
 * EP0711. Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un
 * libro. Deberá disponer de métodos para incrementar la página leída, para obtener
 * información de la última página que se ha leído y para comenzar desde el principio una
 * nueva lectura del mismo libro.
 */

public class MarcaPagina {
    private int pagina = 1;

    public void ultimaPagina() {
        System.out.println("La última página es: " + pagina);
    }

    public void nuevaLectura() {
        System.out.println("Comenzando nueva lectura... La página actual es 1");
        pagina = 1;
    }

    public void incrementarPagina() {
        System.out.println("Leyendo la siguiente página...");
        System.out.println("Página anterior: " + pagina);
        pagina++;
        System.out.println("Página actual: " + pagina);
    }

    public static void main(String[] args) {
        MarcaPagina Libro = new MarcaPagina();
        Libro.nuevaLectura();
        Libro.incrementarPagina();
        Libro.ultimaPagina();
        Libro.nuevaLectura();
    }
}