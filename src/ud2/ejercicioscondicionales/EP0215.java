package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Escribe una aplicación que solicite por consola dos números reales que
 * corresponden a la base y la altura de un triángulo. Deberá mostrarse su área, comprobando
 * que los números introducidos por el usuario no son negativos, algo que no tendría sentido.
 */

public class EP0215 {
    public static void main(String[] args) {
        double altura;
        double base;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la altura del triángulo: ");
        altura = sc.nextDouble();
        System.out.print("Escribe la base del triángulo: ");
        base = sc.nextDouble();
        sc.close();

        if (base < 0 || altura < 0) {
            area = (base * altura)/2;
            System.out.printf("La área del triángulo es: %d\n", area);
        } else {
            System.out.println("Los números que has introducido son negativos.");
        }
    }
}
