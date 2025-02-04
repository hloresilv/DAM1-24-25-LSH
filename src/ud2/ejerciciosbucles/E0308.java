package ud2.ejerciciosbucles;

/*
 * E0308. Pedir diez números enteros por teclado y mostrar la media.
 * Amplía codificando el número de números como una constante.
 */
import java.util.Scanner;

public class E0308 {
    public static void main(String[] args) {
        int total = 0;
        int suma = 0;
        int media = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Introduce el número %d: ", i);
            suma = sc.nextInt();
            total = suma + total;
        }
        sc.close();

        media = total / 10;
        System.out.printf("La media de los números introducidos es: %d\n", media);
    }
}
