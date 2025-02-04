package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * 9. Escribir una aplicación que indique cuántas cifras tiene un número entero
 * introducido por teclado, que estará comprendido entre 0 y 99999.
 */

public class E0209 {
    public static void main(String[] args) {
        int numeroEntero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero comprendido entre 0 y 99999: ");
        numeroEntero = sc.nextInt();
        sc.close();

        // Como le pedimos al usuario un número entero, suponemos que no tenemos que
        // tener en cuenta casos como introducir "99999.1"
        if (numeroEntero > 9999 && !(numeroEntero > 99999)) {
            System.out.printf("El número %d tiene 5 cifras", numeroEntero);
        } else if (numeroEntero > 999) {
            System.out.printf("El número %d tiene 4 cifras", numeroEntero);
        } else if (numeroEntero > 99) {
            System.out.printf("El número %d tiene 3 cifras", numeroEntero);
        } else if (numeroEntero > 9) {
            System.out.printf("El número %d tiene 2 cifras", numeroEntero);
        } else {
            System.out.printf("El número %d tiene una cifra", numeroEntero);
        }
    }
}