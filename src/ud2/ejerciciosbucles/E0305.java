package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
 * E0305. Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador
tendrá que introducir la solución de la suma de dos números aleatorios comprendidos
entre 1 y 100. Mientras la solución sea correcta, el juego continuará. En caso contrario, el
programa terminará y mostrará el número de operaciones realizadas correctamente.
Amplía el programa para que muestre el número de aciertos al terminar.
Variante. Permite al usuario un número limitado de fallos.
 */
public class E0305 {
    public static void main(String[] args) {
        int numeroIntroducido = 0;
        int respuestasCorrectas = 0;
        /*
         * Math.random devuelve un número decimal entre 0 y 1, sin incluir el 1. El
         * número más grande que nos puede salir es 0.99 y el más bajo es 0
         * Entonces podemos multiplicar cualquier número que nos salga por 99 (0.99*99
         * es igual a 98, y 0*99 es igual a 0), y luego sumarle 1 para que pueda incluir
         * el 99 como nos pide el ejercicio
         * Después le ponemos (int) al principio para que no nos salgan números
         * decimales, aunque no era necesario en este caso
         */

        int numeroAleatorio1 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio2 = (int) (Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.printf("¿Cuánto es %d más %d? ", numeroAleatorio1, numeroAleatorio2);
        numeroIntroducido = sc.nextInt();
        
        do {
            System.out.printf("¿Cuánto es %d más %d? ", numeroAleatorio1, numeroAleatorio2);
            numeroIntroducido = sc.nextInt();
            respuestasCorrectas++;
        } while(numeroIntroducido == (numeroAleatorio1 + numeroAleatorio2));
        
        System.out.println("Respuesta incorrecta! Juego terminado. Numero de respuestas correctas: " + respuestasCorrectas);
        sc.close();
    }
}
