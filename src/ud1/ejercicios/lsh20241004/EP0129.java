package ud1.ejercicios.lsh20241004;

import java.util.Scanner;
/*
 * EP0129. Escribe un programa que tome como entrada un número entero e indique qué
 * cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7.
A 13 hay que sumarle 1 para que el resultado (13+1=14) sea múltiplo de 7.
Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1,
respectivamente.
Pista: El operador módulo puede ser muy útil para solucionar esta actividad.

 */
public class EP0129 {
    public static void main(String[] args) {
        int numeroEntero;
        double cantidadSumar = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce el número: ");
            numeroEntero = sc.nextInt();

            int resto = numeroEntero % 7;
            cantidadSumar = (resto == 0) ? 0 : (7-resto);
        } catch (Exception e) {
            System.out.println("Número introducido no es un número o traspasa el rango de valores double");
        }

        String multiplo = (cantidadSumar == 0) ? "múltiplo de 7" : "no múltiplo de 7";
        System.out.printf("La cantidad a sumar a tu número %s para que sea un múltiplo de 7 es: %.2f", multiplo, cantidadSumar);
    }
}
