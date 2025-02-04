package ud2.ejercicioscondicionales;

import java.util.Scanner;

// Diseña una aplicación que solicite un número al usuario e indique si es par o impar.

public class E0201 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        numero = sc.nextInt();
        sc.close();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + "es impar.");
        }
    }
}
