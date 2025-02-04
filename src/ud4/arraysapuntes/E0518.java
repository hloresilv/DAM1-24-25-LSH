package ud4.arraysapuntes;

import java.util.Scanner;

public class E0518 {

    public static boolean isMagicMatrix(int[][] m) {
        if (m == null || m.length != 4 || m[0].length != m.length)
            return false;

        int sumPrev = 0;

        for (int i = 0; i < m.length; i++) {
            int sum = 0;

            for (int j = 0; j < m.length; j++) {
                sum += m[i][j];
            }
            if (i == 0)
                sumPrev = sum;
            else if (sum != sumPrev)
                return false;
        }

        for (int i = 0; i < m.length; i++) {
            int sum = 0;

            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
            if (sumPrev != sum)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrizMagica = new int[4][4];
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica[i].length; j++) {
                System.out.print("Introduce el valor por teclado de la fila " + i + " en la columna " + j + ": ");
                matrizMagica[i][j] = sc.nextInt();
            }
        }

        if (isMagicMatrix(matrizMagica))
            System.out.println("Es una matriz mágica");
        else
            System.out.println("No es una matríz mágica.");
    }
}
