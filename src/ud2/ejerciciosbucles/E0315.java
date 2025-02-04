package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
 * Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos
 * de lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
 */

public class E0315 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para dibujar el triángulo rectángulo: ");
        n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= n; i++) { 
            for (int j = 0; j < n - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        } 
    }
}
