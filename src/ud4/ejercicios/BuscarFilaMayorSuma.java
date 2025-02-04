package ud4.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
* Escribe un método en Java que reciba una matriz de enteros y
* determine y devuelva la fila que tiene la mayor suma de sus elementos
*/
public class BuscarFilaMayorSuma {
    static int[] mayorSuma(int[][] matriz) {
        if (matriz.length == 0 || matriz == null) {
            int[] t = new int[0];
            return t;
        } else if (matriz.length == 1) {
            int[] t = new int[0];
            t = Arrays.copyOf(matriz[1], matriz[1].length);
            return t;
        }

        int[] t = new int[0];
        int suma = 0;
        int mayorSuma = 0;
        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < matriz[i].length; j++) { // Columnas
                suma += matriz[i][j];
            }
            if (suma > mayorSuma) { // De esta forma, si son iguales, no habrá problemas y se devolverá una de las dos filas mayores
                t = Arrays.copyOf(matriz[i], matriz.length);
            } 
            suma = 0;
        }

        return t;
    }

    public static void main(String[] args) {
        final int FILAS = 3, COLUMNAS = 3;
        Scanner sc = new Scanner(System.in);
        int i, j;
        int[][] A = new int[FILAS][COLUMNAS]; 

        System.out.println("Introduce los elementos de la matriz: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Valores de la matriz:");
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        int[] t = mayorSuma(A);
        System.out.println(Arrays.toString(t));
    }
}