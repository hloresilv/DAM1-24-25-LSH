package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
 * Pedir un número y calcular su factorial. Por ejemplo el factorial de 5 se denota 5! y
 * es igual a 5 x 4 x 3 x 2 x 1 = 120.
 */

public class E0311 {
    public static void main(String[] args) {
        int numero;
        int factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        numero = sc.nextInt();
        sc.close();

        for (int i = numero; i > 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
