package ud1.ejercicios.lsh20241004;

import java.util.Scanner;
/*
 * Dado el siguiente polinomio de segundo grado:
 * y = ax2 + bx + c
 * crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
 * correspondiente de y
 */
public class EP0113 {
    public static void main(String[] args) {
        System.out.println("Este programa es un calculador de ecuaciones de segundo grado.");

        // Declaración de variables locales
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double x = 0.0;

        // Input
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce el coeficiente a: ");
            a = sc.nextDouble();
            System.out.print("Introduce el coeficiente b: ");
            b = sc.nextDouble();
            System.out.print("Introduce el coeficiente c: ");
            c = sc.nextDouble();
            System.out.print("Introduce el valor de X: ");
            x = sc.nextDouble();
        }   

        // Debug
        System.out.println("Has introducido " + a + " como valor del coeficiente a");
        System.out.println("Has introducido " + b + " como valor del coeficiente b");
        System.out.println("Has introducido " + c + " como valor del coeficiente c");
        System.out.println("Has introducido " + x + " como valor de x");

        // Cálculo del polinomio de segundo grado
        double result = (a * Math.pow(x, 2)) + (b * x) + c;
        System.out.println("El resultado del polinomio es: " + result);
    }
}
