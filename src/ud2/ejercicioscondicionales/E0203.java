package ud2.ejercicioscondicionales;

import java.util.Scanner;

/* Solicitar dos números distintos y mostrar cuál es el mayor. */

public class E0203 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otr número entero: ");
        num2 = sc.nextInt();
        sc.close();

        if (num1 == num2) {
            System.out.println("Los dos números son iguales");
        } else {
            if (num1 > num2) {
                System.out.println("El número " + num1 + " es el mayor.");
            } else {
                System.out.println("El número " + num2 + " es el mayor.");
            }
        }
    }
}
