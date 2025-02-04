package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Pedir los coeficientes de una ecuación de segundo grado 
 * (ax2 + bx + c = 0) y
 * mostrar sus soluciones reales
 */

public class E0208 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Introduce el coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Introduce el coeficiente c: ");
        c = sc.nextDouble();
        sc.close();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Dos soluciones reales y distintas
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Las soluciones son: " + root1 + " y " + root2);
        } else if (discriminant == 0) {
            // Una solución real (doble raíz)
            double root = -b / (2 * a);
            System.out.println("La solución es: " + root);
        } else {
            // No hay soluciones reales
            System.out.println("No hay soluciones reales.");
        }
    }
}