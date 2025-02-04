package ud2.ejerciciosbucles;

import java.util.Scanner;
/*
 * Diseñar un programa que muestre, para cada número introducido por teclado, si
 * es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
 * introducido sea 0.
 */
public class E0301 {
    public static void main(String[] args) {
        double numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = sc.nextDouble();
        
        while(!(numero == 0)) {
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            }
            if (numero > 0) {
                System.out.println("El número es positivo.");
            }
            System.out.printf("El cuadrado del número es: %.2f", Math.sqrt(numero));
            System.out.print("Introduce  otro número: ");
            numero = sc.nextDouble();
        }

        sc.close();
    }
}
