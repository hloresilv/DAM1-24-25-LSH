package ud2.ejercicioscondicionales;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;

/*
 * Modifica la actividad anterior (EP0217) para que, además de los dos números
 * aleatorios, también aparezca aleatoriamente la operación que debe realizar el jugador:
 * suma, resta o multiplicación.
 * Amplía el programa anterior para que muestre el número de segundos que el usuario ha
 * tardado en responder. Utiliza la clase LocalTime.
 */

public class EP0218 {
    public static void main(String[] args) {
        int numeroAleatorio1 = (int) (Math.random() * 99) + 1;
        int numeroAleatorio2 = (int) (Math.random() * 99) + 1;

        int operacionSeleccionada = (int) (Math.random() * 3);
        String operacion = "";
        int resultado = 0;

        if (operacionSeleccionada == 0) {
            operacion = "+";
            resultado = numeroAleatorio1 + numeroAleatorio2;
        } else if (operacionSeleccionada == 1) {
            operacion = "-";
            resultado = numeroAleatorio1 - numeroAleatorio2;
        } else if (operacionSeleccionada == 2) {
            operacion = "*";
            resultado = numeroAleatorio1 * numeroAleatorio2;
        }

        Scanner sc = new Scanner(System.in);
        System.out.printf("¿Cuánto es %d %s %d? ", numeroAleatorio1, operacion, numeroAleatorio2);

        LocalTime inicio = LocalTime.now();
        int respuestaUsuario = sc.nextInt();

        LocalTime fin = LocalTime.now();

        long segundos = Duration.between(inicio, fin).getSeconds();
        sc.close();

        if (respuestaUsuario == resultado) {
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es " + resultado + ".");
        }
        
        System.out.println("Tardaste " + segundos + " segundos en responder.");
    }
}
