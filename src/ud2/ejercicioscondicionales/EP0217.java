package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
 * aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe
 * indicar si el resultado de la operación es correcto o incorrecto.
 */

public class EP0217 {
    public static void main(String[] args) {
        // int MAX = 99;
        // int MIN = 1;
        int numeroIntroducido;

        /*
         * Math.random devuelve un número decimal entre 0 y 1, sin incluir el 1. El
         * número más grande que nos puede salir es 0.99 y el más bajo es 0
         * Entonces podemos multiplicar cualquier número que nos salga por 99 (0.99*99
         * es igual a 98, y 0*99 es igual a 0), y luego sumarle 1 para que pueda incluir
         * el 99 como nos pide el ejercicio
         * Después le ponemos (int) al principio para que no nos salgan números
         * decimales, aunque no era necesario en este caso
         */

        int numeroAleatorio1 = (int) (Math.random() * 99) + 1; // El profesor puso (Math.random() * (MAX-MIN+1)) + MIN, que es lo mismo que lo mío
        int numeroAleatorio2 = (int) (Math.random() * 99) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.printf("¿Cuánto es %d más %d? ", numeroAleatorio1, numeroAleatorio2);
        numeroIntroducido = sc.nextInt();
        sc.close();

        if (numeroIntroducido == (numeroAleatorio1 + numeroAleatorio2)) {
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("Respuesta incorrecta.");
        }
    }
}
