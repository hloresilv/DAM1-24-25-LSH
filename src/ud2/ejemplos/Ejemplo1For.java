package ud2.ejemplos;

/*
* programa que muestra los números del 1 al 10
*/
public class Ejemplo1For {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 10; i++) { // inicio del for
            System.out.print(i + " ");
        } // fin del for

        /*Inicialización dentro del bucle */
        for (int j = 1; j <= 10; j++) { //inicio del for
            System.out.print(j + " ");
        } //fin del for
        
        System.out.println("\nFin programa");
    }
}