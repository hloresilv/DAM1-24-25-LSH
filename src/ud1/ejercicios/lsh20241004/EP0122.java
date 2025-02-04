package ud1.ejercicios.lsh20241004;

import java.util.Scanner;

/*
 * EP0122. Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, 
 * mostrando el resultado por pantalla.
 */
public class EP0122 {
    public static void main(String[] args) {
        double farenheit;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce la temperatura en Farenheit: ");
            farenheit = sc.nextDouble();
        }
        double celsius = 5/9.0 * (farenheit - 32);
        System.out.println("La temperatura en grados Celsius es: " + celsius);
    }
}
