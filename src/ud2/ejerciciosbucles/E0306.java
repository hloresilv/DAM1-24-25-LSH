package ud2.ejerciciosbucles;

import java.util.Scanner;
/*
 * Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
 * todos los números del 1 al n.
 */
public class E0306 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        sc.close();
        
        System.out.printf("¡Vamos a aprender a contar desde 0 hasta %d!\n", numero);

        for(int i = 0; i <= numero; i++) {
            System.out.println("Número: " + i);
        }

        System.out.println("¡Terminamos de contar!");
    }
}
