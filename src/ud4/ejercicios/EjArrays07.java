package ud4.ejercicios;

import java.util.Scanner;

// Leer N alturas y calcular la altura media. Calcular cuántas hay superiores a la media y cuántas inferiores.

public class EjArrays07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de alturas a leer: ");
        int n = sc.nextInt();
        
        int[] alturas = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la altura número " + i + ": ");
            alturas[i] = sc.nextInt();
            suma += alturas[i];
        }
        sc.close();

        int media = suma / n, supMedia = 0, infMedia = 0;
        for (int i = 0; i < n; i++) {
            if (alturas[i] > media)
                supMedia++;
            else if (alturas[i] < media)
                infMedia++;
        }

        System.out.println("Media de alturas: " + media);
        System.out.println("Alturas superiores a la media: " + supMedia);
        System.out.println("Alturas inferiores a la media: " + infMedia);

    }
}
