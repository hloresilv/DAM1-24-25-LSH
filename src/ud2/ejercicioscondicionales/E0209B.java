package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Realiza una versión del programa anterior para que indique cuantes cifras tiene un
 * número comprendido entre -99999 y 99999
 */

public class E0209B {
    public static void main(String[] args) {
        int numeroEntero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero comprendido entre -99999 y 99999: ");
        numeroEntero = sc.nextInt();
        sc.close();

        if (numeroEntero < -99999 || numeroEntero > 99999) {
            System.out.println("El número debe estar entre -99999 y 99999.");
            return;
        }

        int cifras = 0;
        int numeroAbsoluto = Math.abs(numeroEntero);

        if (numeroAbsoluto == 0) {
            cifras = 1;
        } else {
            while (numeroAbsoluto > 0) {
                numeroAbsoluto /= 10;
                cifras++;
            }
        }

        System.out.printf("El número %d tiene %d cifra(s). %n", numeroEntero, cifras);
    }
}
