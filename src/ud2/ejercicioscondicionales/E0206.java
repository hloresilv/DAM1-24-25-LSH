package ud2.ejercicioscondicionales;

import java.util.Scanner;

// Solicitar dos números y mostrar cuál es el mayor o si son iguales.

public class E0206 {
    public static void main(String[] args) {
        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();
        sc.close();

        if (num1 > num2) {
            System.out.printf("El mayor número es el primer número introducido: %.2f", num1);
        } else if (num2 > num1) {
            System.out.printf("El mayor número es el segundo número introducido: %.2f", num2);
        } else {
            System.out.printf("Los los números introducidos (%.2f y %.2f) son iguales.", num1, num2);
        }
    }
}
